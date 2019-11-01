// scala program for multidimensional list

// use of two dimensional list 
import scala.collection.immutable._
  
// creating object 
object GFG { 
    // main method 
    def main(args:Array[String]) { 
        // creating a two-dimensional List. 
        val twodlist: List[List[Int]] =
        List( 
            List(1, 0, 0), 
            List(0, 1, 0), 
            List(0, 0, 1) 
            ) 
        println("The two dimensional list is:") 
        println(twodlist) 
    } 
} 