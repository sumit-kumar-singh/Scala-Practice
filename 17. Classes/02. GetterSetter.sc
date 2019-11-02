// scala program for getter and setter demo

// if any member of class is private then getter is used to access it
// and setter is used to change the value
// for var ->  getter   setter
// for var ->  getter   ------
// default ->  ------   ------

// in scala there are three access modifiers
// private, protected and public(default)
// private - only in class and companion
// protected - not outside package and in package
// public - to all outside pkg, pkg, class, subclass and companion

// creating class
class GetSetDemo(private var age : Int, var name : String) {
	// creating getter for private var age
	def printAge() {
		println("Age is : " + age)
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new GetSetDemo(25, "Mark Smith")
		s.printAge
		println("Name is : " + s.name)
	}
}


