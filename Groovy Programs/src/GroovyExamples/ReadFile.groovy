package GroovyExamples

String filePath = "D:\\Learning Selenium\\TestData\\file.txt"
File myFile=new File(filePath)

//reading the entire file
println myFile.text;

//collect lines into a list
def list = myFile.collect { it }
println "$list"
