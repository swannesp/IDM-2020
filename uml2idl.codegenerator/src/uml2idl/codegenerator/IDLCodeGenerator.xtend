package uml2idl.codegenerator

import uml2idl.metamodel.idl.IDLModel
import uml2idl.metamodel.idl.Service
import java.util.List
import uml2idl.metamodel.idl.Struct
import uml2idl.metamodel.idl.Field

class IDLCodeGenerator {
	
	
def String generateCode(IDLModel inputThriftModel) {
	return '''
	«FOR struct : inputThriftModel.structs»
			«generateStruct(struct)»
	«ENDFOR»
	«FOR serv : inputThriftModel.services»
		«generateService(serv)»
	«ENDFOR»
'''
	}
	
def String generateService(Service service) {
	return '''service «service.name» {
	«FOR f : service.functions»
			«getType(f.type, f.returnsList)» «f.name»(«FOR p: f.parameters»«p.id»:«getType(p.type, p.isList)» «p.name»«IF (f.parameters.indexOf(p) != (f.parameters.size() - 1))»,«ENDIF» «ENDFOR»)
	«ENDFOR»
}'''
}

def String generateType(String type) {
	if (type == 'undefined')
		return '''void'''
	else
		return type;
}

def String generateStruct(Struct struct) {
	return '''struct «struct.name» {
	«FOR f : struct.fields»
			«f.id»:«getType(f.type, f.isList)» «f.name»
	«ENDFOR»
}'''
}

def String getType(String type, boolean isList){
	var result = '''''';
	if (type == 'EByte'){
		result = '''i8''';}
	else if (type == 'EShort' || type == 'EChar'){
		result = '''i16''';}	
	else if (type == 'EInt' || type == 'Real'){
		result = '''i32''';}
	else if (type == 'ELong'){
		result = '''i64''';}
	else if (type == 'EBoolean'){
		result = '''bool''';}
	else if (type == 'EDouble'){
		result = '''double''';}
	else if (type == 'undefined'){
		result = '''void''';}
	else{result = type;}
		
	if (isList){result = '''list<«result»>''';}
		
	return result;
}
}
