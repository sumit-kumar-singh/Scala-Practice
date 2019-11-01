// scala program for set operations

// use typical math operations like: intersection and union

// importing library
import scala.collection.immutable._  

// creating object
object MainObject {
	// main method
	def main(args:Array[String]){ 
		// creating sets 
        var games = Set("Cricket","Football","Hocky","Golf","C")  
        var alphabet = Set("A","B","C","D","E","Golf")

        // set intersecting
        var setIntersection = games.intersect(alphabet)  
        println("Intersection using intersect : " + setIntersection)  
        println("Intersection using & operator : " + (games & alphabet))

        // set union 
        var setUnion = games.union(alphabet) 
        println("Union of both set using union: ") 
        println(setUnion)
        println("Union of both set using | operator : ")
        println(games | alphabet)
    }  
}

