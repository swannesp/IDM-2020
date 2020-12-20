struct DataType1 {
	1:DataType2 value
}
struct DataType2 {
	2:double value
}
service E {
	void action(1:DataType1 param )
}
