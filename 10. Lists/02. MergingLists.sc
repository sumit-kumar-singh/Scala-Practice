// scala program to merge lists

// creating class
class ListMerging {
	// creating lists  
        val a = List("towards", "data", "science")  
        val b = List("is", "a", "computer science", "portal") 
        val c = List("for", "geeks") 

	// defining function
	// 1st way using ++
	def UsingPlusOperator() {
        // Merging Lists 
        val d = a ++ b ++ c 
        println("After merging lists : ")  
        println(d)  
	}

	// 2nd way using :::
	def UsingPlusColon() {
        // Merging Lists 
        val d = a ::: b ::: c 
        println("After merging lists : ")  
        println(d)  
	}

	// 3rd way using concat
	def UsingConcat() {
        // Merging Lists 
        val d = List.concat(a, b)
        println("After merging lists : ")  
        println(d)  
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new ListMerging()
		s.UsingPlusOperator()
		s.UsingPlusColon()
		s.UsingConcat()
	}
}