// scala program for throw keyword demo

// you can throw exception explicitly and catch it in you code
// scala provides throw keyword to throw exception
// the throw keyword mainly used to throw custom exception
// throw expression has a return type of Nothing
// throw is the keyword used to throw an exception
// whereas throws is the keyword used to declare exception
// catch block uses pattern matching to handle exceptions

// creating class
class ExceptionExample { 
	// creating validate function 
    def validate(age:Int)= {  
        if(age<18)  
            throw new ArithmeticException("You are not eligible")  
        else println("You are eligible")  
    }  
}  
  
// creating object
object MainObject { 
	// main method 
    def main(args:Array[String]) {  
        var e = new ExceptionExample()
        println("No Exception Thrown : ")
        e.validate(20)  
        println("Exception Thrown : ")
        e.validate(10) 
    }  
}