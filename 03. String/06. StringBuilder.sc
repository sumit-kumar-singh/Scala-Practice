// scala program of the string builder

/*
A String object is immutable, i.e. a String cannot be changed once created.
In situations where you need to perform repeated modifications to a string,
we need StringBuilder class. StringBuilder is utilized to append input 
data to the internal buffer. We can perform numerous operations with the 
support of methods on the StringBuilder. This operation comprises 
appending data, inserting data, and removing data.

Important points:

1. The StringBuilder class is beneficent for mutable strings to 
   extend effectively.
2. The instance of StringBuilder is utilized like a String.
3. Strings of Scala are immutable so, when you require a mutable String 
   then you can use StringBuilder.
*/

// creating class
class StringBuild {
	// creating StringBuilder  
	val x = new StringBuilder("Author")

	// function for appending characters
	// (x += ‘ ‘) is utilized to append a character
	def appendCharacters() {
		// appending character  
		val y = (x += 's') 

		// displays the string after appending the character  
        println(y) 
	}

	// function for appending string
	// (x ++= ‘ ‘) is utilized to append String
	def appendString() {
		// appending character  
		val y = (x ++= " of Medium.com") 

		// displays the string after appending the string  
        println(y) 
	}

	// function for appending number
	// x.append(n) is utilized to append the number
	def appendNumber() {
		// creating StringBuilder  
		val x = new StringBuilder("Number of Authors : ")
		// appending number  
		val y = x.append(800) 

		// displays the number after appending the string  
        println(y) 
	}

	// function for clearing string builder
	// x.clear() is utilized to clear the content of the StringBuilder
	def clearStringBuilder() {
		// creating StringBuilder  
		val x = new StringBuilder("Some text")
		// clearing string builder 
		val y = x.clear()

		// displays the string builder after clearing 
        println(y) 
	}

	// function for delete operation
	// q.delete(i, j) is utilized to delete the character
	def deleteOperation() {
		// creating StringBuilder  
		val x = new StringBuilder("Clolomputer Science")
		// deleting characters  
		val y = x.delete(1, 4)  

		// displays the string builder after deleting 
        println(y) 
	}

	// function for insert operation
	// q.insert(i, “s”) is utilized to insert the String (s) at index i
	def insertOperation() {
		// creating StringBuilder  
		val x = new StringBuilder("Medium CS portal")
		// inserting characters  
		val y = x.insert(6, " is a" )   

		// displays the string builder after inserting 
        println(y) 
	}
}

// creating object
object MainObject {
	// main method
	def main(agrs : Array[String]) {
		var s = new StringBuild()
		s.appendCharacters()
		s.appendString()
		s.appendNumber()
		s.clearStringBuilder()
		s.deleteOperation()
		s.insertOperation()
	}
}