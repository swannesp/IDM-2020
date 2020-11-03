package thriftcodegen

import org.junit.jupiter.api.Test
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import thrift.metamodel.IDL.IDLModel
import java.nio.file.Files
import java.nio.file.Paths

class CodegenTestSuite {

	private def void generateCodeFrom(String modelPath) {
		// Load model
		val ResourceSet rs = new ResourceSetImpl()
		val Resource r = rs.getResource(URI::createFileURI(modelPath), true)
		val root = r.contents.get(0)

		// Generate code
		val result = new ThriftCodeGenerator().generateCode(root as IDLModel)
		r.unload

		// Save as file
		val codePathString = modelPath.replace("xmi", "thrift")
		val codePath = Paths.get(codePathString)
		Files.writeString(codePath, result)
	}

	@Test
	def void generateCodeCache() {
		generateCodeFrom("../thrift.testmodels/models/output/idl/cache.xmi")
	}

	@Test
	def void generateCodeCacheDatatypes() {
		generateCodeFrom("../thrift.testmodels/models/output/idl/cache-datatypes.xmi")
	}
}
