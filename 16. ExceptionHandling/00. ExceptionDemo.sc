// scala program for without exception handling demo

// it is a mechanism which is used to handle abnormal conditions
// you can also avoid termination of your program unexpectedly
// scala doesn't have checked exceptions
// these events change the flow control of the program in execution
// all exception and errors types are sub classes of class Throwable

// creating class
class ExceptionExample {  
    def divide(a:Int, b:Int) = {
    	// exception occurred here
        a/b               
        println("Rest of the code is executing...")  
    }  
}  

// creating object
object MainObject{  
	// main method
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        e.divide(100,0)  

 		// here we get java.lang.ArithmeticException: / by zero error
    }  
}

