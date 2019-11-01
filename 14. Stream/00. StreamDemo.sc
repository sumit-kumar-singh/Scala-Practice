// scala program for stream demo

// stream is a lazy list, evaluates elements only when they are required
// scala supports lazy computation
// it increases performance of your program

// importing library
import scala.collection.immutable._  

// creating object 
object MainObject {  
	// main method
    def main(args:Array[String]) {  
    	// defining stream
        var stream = 100 #:: 200 #:: 85 #:: Stream.empty
        // print stream
        println(stream)  

        // defining stream uisng toStream
        var stream2 = (1 to 10).toStream 
        // print stream 
        println(stream2)  

        // print first element of stream
        var firstElement = stream2.head  
        println(firstElement)  
        println(stream2.take(10))

        // map operation on stream  
        println(stream.map{_*4})

        // you can see that second element is not evaluated
        // a question mark is displayed in place of element
        // scala does not evaluate list until it is required
    
    }  
}  