// scala program for constructor demo

// here, constructor is created in class definition
// this is called primary constructor.

// creating primary constructor
class Student(id : Int, var name : String) {
	// creating function to show
	def show() {
		println("Id is : " + id)
		println("Name is : " + name)
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// passing values to constructor  
		var s1 = new Student(2445, "Sumit Kumar")
		var s2 = new Student(2246, "Martin Smith")
		// calling a function by using an object
		println("First Object : ")
		s1.show()
		println("Second Object : ")
		s2.show()
		// change is only allowed if var is in class parameter
		// it should not be none or val
		println("Changing name for first object: ")
		s1.name = "Jhon Clack"
		s1.show()
	}
}

