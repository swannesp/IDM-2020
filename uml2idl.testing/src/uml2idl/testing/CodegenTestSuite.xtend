package uml2idl.testing

import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import java.util.stream.Collectors
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import uml2idl.codegenerator.IDLCodeGenerator
import uml2idl.metamodel.idl.IDLModel

/**
 * Run the IDLCodeGenerator on each IDL model found in "models/output/idl/*.xmi".
 * 
 * Results are produced in the same folder but with the '.thrift' file extension.
 */
class CodegenTestSuite {

	private def void generateCodeFrom(String modelPath) {
		// Load model
		val ResourceSet rs = new ResourceSetImpl()
		val Resource r = rs.getResource(URI::createFileURI(modelPath), true)
		val root = r.contents.get(0)

		// Generate code
		val result = new IDLCodeGenerator().generateCode(root as IDLModel)
		r.unload

		// Save as file
		val codePathString = modelPath.replace("xmi", "thrift")
		val codePath = Paths::get(codePathString)
		Files::writeString(codePath, result)
	}

	@ParameterizedTest
	@MethodSource("modelProvider")
	def void generateCode(String argument) {
		generateCodeFrom(argument);
	}

	def static List<String> modelProvider() {
		return Files::walk(Paths::get("models/output/idl/")).map([p|p.toString]).filter([s|s.endsWith(".xmi")]).collect(Collectors.toList())
	}

}
