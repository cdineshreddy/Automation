package GroovyExamples

String filePath = "./TestData/file.txt"
File myFile=new File(filePath)

//reading the entire file
println myFile.text;

//collect lines into a list
def list = myFile.collect { it }
println "$list"
