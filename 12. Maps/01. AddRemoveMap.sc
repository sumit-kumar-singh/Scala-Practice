// scala program to add and remove items in map

// creating object
object MainObject {
	// main method
    def main(args:Array[String]) {
    	// creating map
        var map = Map("A"->"Apple", "B"->"Ball")  

        // accessing value by using key  
        println("Value of key A : " + map("A"))

        // adding a new element to map  
        var newMap = map + ("C" -> "Cat", "D" -> "Dog")
        println("Map after adding new elements")
        println(newMap)

        // removing an element from map  
        var removeElement = newMap - ("B")
        println("Map after removing element B")
        println(removeElement)

        // contains in map
        println("Is map contains A? : " + map.contains("A"))

        // concatenating two map
        println("Map after concatenating")
        println(map ++ removeElement)
    }  
}  