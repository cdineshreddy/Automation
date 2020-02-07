package GroovyExamples

class List {
	
	static void main(args) {
	def names=["Dinesh","Naresh","Ramesh","Suresh"];
	println names[1];
	println names.get(2);
	
	def test=[1,2,3,['a','b',"Hello"],"Grrovy"]
	println test.get(3)
	println test[3][2]
	println test[3].contains("b")
	
	}
}
