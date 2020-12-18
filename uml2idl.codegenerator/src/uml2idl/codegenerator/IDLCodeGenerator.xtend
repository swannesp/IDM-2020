package uml2idl.codegenerator

import uml2idl.metamodel.idl.IDLModel
import uml2idl.metamodel.idl.Service

class IDLCodeGenerator {
	
	
	def String generateCode(IDLModel inputThriftModel) {
		return '''«FOR s : inputThriftModel.members»
			«generateService(s)»
			«ENDFOR»
			'''
	}
	
	def String generateService(Service service){
		return '''service «service.name» { 
		«FOR f: service.functions»
			«f.type» «f.name»
		«ENDFOR»
		
		}'''
	}
}
