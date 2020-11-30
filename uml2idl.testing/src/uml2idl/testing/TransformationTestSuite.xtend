package uml2idl.testing

import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import java.util.stream.Collectors
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import uml2idl.testing.util.ATLHelper

/**
 * Run the IDLCodeGenerator on each IDL model found in "models/input/uml/*.uml".
 * 
 * Results are produced in "models/ouptput/idl/".
 */
class TransformationTestSuite {
	private def void transformFrom(String modelPath) {
		val String inputMetamodelPath = "http://www.eclipse.org/uml2/2.1.0/UML"
		val String inputMetamodelATLName = "UML"
		val String outputMetamodelPath = "../uml2idl.metamodel/model/idl.ecore"
		val String outputMetamodelATLName = "IDL"
		val String inputModelPath = modelPath
		val String transformationAsmPath = "../uml2idl.transformation/src/uml2idl.asm"
		
		val modelName = Paths::get(modelPath).fileName.toString
		val String outputModelPath = "models/output/idl/" + modelName.substring(0, modelName.length - 3) + "xmi"

		ATLHelper::transform(inputMetamodelPath, inputMetamodelATLName, outputMetamodelPath, outputMetamodelATLName,
			inputModelPath, transformationAsmPath, outputModelPath)
	}

	@ParameterizedTest
	@MethodSource("modelProvider")
	def void transform(String argument) {
		transformFrom(argument);
	}

	def static List<String> modelProvider() {
		return Files::list(Paths::get("models/input/uml/")).map([p|p.toString]).filter([s|s.endsWith(".uml")]).collect(
			Collectors.toList())
	}
}
