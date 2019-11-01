// scala program for throws keyword demo

// scala provides throws keyword to declare exception
// you can declare exception with method definition
// it provides information to the caller function that 
// this method may throw this exception.
// It helps to caller function to handle and enclose that code in
// try-catch block to avoid abnormal termination of program.
// either use throws keyword or throws annotation to declare exception

// creating class 
class ExceptionExample {
	// throws annotation
    @throws(classOf[NumberFormatException])  
    def validate() = {  
        "abc".toInt  
    }  
}  

// creating object
object MainObject {  
	// main method
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        try {  
            e.validate()  
        } catch {  
            case ex : NumberFormatException => println("Exception handeled here")  
        }  
        println("Rest of the code executing...")  
    }  
}  


