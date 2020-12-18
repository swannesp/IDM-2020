package uml2idl.codegenerator

import uml2idl.metamodel.idl.IDLModel
import uml2idl.metamodel.idl.Service
import java.util.List

class IDLCodeGenerator {
	
	
	def String generateCode(IDLModel inputThriftModel) {
		return '''«FOR s : inputThriftModel.services»
				«generateService(s)»
				«ENDFOR»
			'''
	}
	
def String generateService(Service service) {
	return '''service «service.name» {
«FOR f : service.functions»
	«generateType(f.type)» «f.name»(«FOR p: f.parameters»«p.type» «p.name», «ENDFOR»)
«ENDFOR»
}'''
}

def String generateType(String type) {
	if (type == 'undefined')
		return '''void'''
	else
		return type;
}


	
}
