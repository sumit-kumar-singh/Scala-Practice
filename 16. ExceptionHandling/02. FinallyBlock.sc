// scala program for demo of finally block

// finally block is used to release resources during exception
// resources may be file, network connection, database connection etc
// the finally block executes guaranteed
// it will be always executed not matter if an exception is thrown or not
// the finally block will be executed after the try and catch blocks,
// but before control transfers back to its origin
// combination - try + catch, try + finally and try + catch + finally

// creating class
class ExceptionExample {  
    def divide(a:Int, b:Int) = {  
        try {  
        	// exception occurred here
            a/b  
            var arr = Array(1,2)
            // exception occurred here
            arr(10)  
        } catch {
        	// handling all exceptions in one catch block
            case e: ArithmeticException => println(e)  
            case ex: Exception =>println(ex)  
            case th: Throwable=>println("Found unknown exception" + th)  
        } finally {  
            println("Finaly block always executes")  
        }  
        println("Rest of the code is executing...")  
    }  
}  
  
// creating object
object MainObject{  
	// main method
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        print(e.divide(100,10))  
    }  
}  