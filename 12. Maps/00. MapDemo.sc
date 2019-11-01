// scala program for map demo

// map is used to store elements
// stores elements in pairs of key and values
// keys must be unique as it is set internally
// you can create map by using two ways either by using comma separated
// pairs or by using rocket operator

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// 1st way
		var map1 : Map[String, String] = {
			Map(("A","Apple"), ("B","Ball"))
		}

		// 2nd way
		var map2 : Map[Int, String] = {
			Map(1->"Apple", 2->"Ball")
		}

		// creating empty map
		var emptyMap : Map[String,String] = Map.empty[String,String]

		// viewing map
		println("Map 1 : ")
		println(map1)
		println("Map 2 : ")
        println(map2)  
        println("Empty Map : " + emptyMap)

        // accessing value by using key
        println("Value of key A in map1 : " + map1("A"))
        println("Value of key 1 in map2 : " + map2(1))  

        // getting keys and values of map
        println("Keys of map 1 : ")
        println(map1.keys)
        println("Values of map 2 : ")
        println(map1.values)
	}
}
