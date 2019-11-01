// scala program for sorted set

// used SortedSet to store integer elements
// it returns a Set after sorting elements

// importing library
import scala.collection.immutable.SortedSet

// creating object           
object MainObject {
	// main method
    def main(args:Array[String]) {
    	// creating sorted sets 
        var numbers: SortedSet[Int] = SortedSet(5, 1, 2,4 ,2)

        // iterating using foreach loop
        println("Sorted Set is : ")
        numbers.foreach((element:Int)=> println(element))  
    }     
}