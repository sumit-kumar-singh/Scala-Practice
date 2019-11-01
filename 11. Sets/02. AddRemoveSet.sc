// scala program to add and remove items in set

// importing library
import scala.collection.immutable._ 

// creating object 
object MainObject {  
    def main(args:Array[String]){
    	// creating set
        var games = Set("Cricket","Football","Hocky","Golf")  
        println(games)

        // adding new element in end
        games += "Racing"                 
        println(games)

        // adding new element, it does not allow duplicacy.  
        games += "Cricket"
        println(games) 

        // removing element 
        games -= "Golf"              
        println(games)
    }  
}  