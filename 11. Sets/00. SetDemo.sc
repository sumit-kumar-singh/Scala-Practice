// scala program for set demo

// used to store unique elements in the set
// does not maintain any order for storing elements
// defined in the Scala.collection.immutable package
// synatx - val variableName:Set[Type] = Set(element1,.... elementN)
// synatx val variableName = Set(element1, element2,... elementN)

// importing library
import scala.collection.immutable._ 

// creating object
object MainObject {  
	// main method
    def main(args:Array[String]) {
    	// an empty set  
        val set1 = Set()

        // creating a set with elements  
        val games = Set("Cricket", "Football", "Hockey", "Golf", "Golf")
        println("Empty set : " + set1) 
        println("Set of games : " )
        // only unique items are stored
        println(games)

        // some methods in sets
        // returns first element present in the set  
        println("Head of set : " + games.head)
        // returns all elements except first element.  
        println("Tail of set : " + games.tail)
        // returns either true or false  
        println("Is game set is empty? : " + games.isEmpty)

        // viewing set using for loop
        println("Elements of set games using for loop : ")
        for(game <- games) {  
                println(game)  
        }

        // viewing set using for foreach loop
        println("Elements of set games using foreach loop : ")
        games.foreach((element:String)=> println(element))
    }
}  