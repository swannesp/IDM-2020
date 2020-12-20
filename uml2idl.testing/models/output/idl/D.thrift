struct MyDataType {
	1:i32 value1
	2:list<i16> value2
}
service D {
	MyDataType do()
	void run(1:MyDataType u )
}
