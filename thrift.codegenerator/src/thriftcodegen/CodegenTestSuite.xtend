package thriftcodegen

import org.junit.jupiter.api.Test
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import thrift.metamodel.IDL.IDLModel

class CodegenTestSuite {

	private def String generateCodeFrom(String modelPath) {
		val ResourceSet rs = new ResourceSetImpl()
		val Resource r = rs.getResource(URI::createFileURI(modelPath), true)
		val root = r.contents.get(0)
		val result = new ThriftCodeGenerator().generateCode(root as IDLModel)
		r.unload
		return result
	}

	@Test
	def void generateCodeCache() {
		println(generateCodeFrom("./model/cache.uml"))
	}
}
