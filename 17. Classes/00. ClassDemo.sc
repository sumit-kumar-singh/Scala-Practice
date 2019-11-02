// scala program for classes

// scala is a pure object oriented programming language
// it allows us to create object and class
// object typically has two characteristics:
// state: data values of an object are known as its state
// behavior: functionality that an object do is known as its behavior
// class is a template or a blueprint
// it is also known as collection of objects of similar type
// you must initialize all instance variables in the class
// there must be an object in which main method is defined
// it provides starting point for your program

// creating class
class ClassDemo {
	// initializing variables
	var age : Int = 0
	var name : String = null
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new ClassDemo()
		println("Age is : "+ s.age)
		println("Name is : " + s.name)
		// changing value of age
		// if it was val then we can't modified it
		s.age = 20
		println("New age is : " + s.age)
	}
}

