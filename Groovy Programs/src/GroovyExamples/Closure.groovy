package GroovyExamples


	
	def test= { println "Hello World" }
	test.call()
	
	def test1= {name-> println "Hello $name" }
	test1.call("Dinesh")
	
	def test2= {a,b,c -> return (a+b+c) }
	println test2(10,20,10)

