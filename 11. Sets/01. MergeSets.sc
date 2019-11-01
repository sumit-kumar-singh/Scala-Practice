// scala program to merge sets

// importing library
import scala.collection.immutable._  

// creating object
object MainObject {
	// main method
    def main(args:Array[String]) {
    	// creating sets
    	val games = Set("Cricket","Football","Hocky","Golf")  
        val alphabet = Set("A","B","C","D","E")

        // merging two sets   
        val mergeSet = games ++ alphabet

        // return size of collection  
        println("Elements in games set : " + games.size)
        println("Elements in alphabet set : " + alphabet.size)   
        println("Elements in mergeSet : " + mergeSet.size)
        println("Set after merging : ")
        println(mergeSet)

        // check whether element is present in the set or not
        println("Golf exists in set : " + games.contains("Golf"))  
        println("Racing exists in set : " + games.contains("Racing"))  
    }  
}  