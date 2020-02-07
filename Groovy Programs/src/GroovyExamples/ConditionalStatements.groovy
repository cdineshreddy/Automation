package GroovyExamples

class ConditionalStatements {
	
	static void main(args) {
		
		//if else
		def num=10;
		if(num==10) {
			println "Number is 10"
		}
		else {
			println "Number is not equal 10"
		}
		
		//Switch case
		def x=11;
		def result;
		
		switch(x) {
			case {x==11}: result = "x is 11"
					break
			case {x>12}: result = "x is greater than 11"
					break
			case {x<12}: result = "x is less than 11"
					break
			default: result = "Enter any number"
					
		}
		println result
		
	}
}
