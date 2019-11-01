// scala program for demo of try and catch block

// scala provides try and catch block to handle exception
// try block is used to enclose suspect code
// catch block is used to handle exception occurred in try block
// can have any number of try catch block in program according to need
// try/catch in Scala is an expression
// a single catch block can handle all kinds of exceptions so flexibility
// the Scala make use of pattern matching in the catch clause

// creating class
class ExceptionExample {  
    def divide(a:Int, b:Int) = {  
        try{ 
        	// exception occurred here 
            a/b  
        }catch{  
            case e: ArithmeticException => println(e)  
        }  
        println("Rest of the code is executing...")  
    }  
}  

// creating object
object MainObject{  
	// main method
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        e.divide(100,0)  
   	// will get java.lang.ArithmeticException: / by zero
   	// but code will continue to execute
    }  
}