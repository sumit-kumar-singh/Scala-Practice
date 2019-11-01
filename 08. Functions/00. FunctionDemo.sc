// scala program for functions demo

// it is a collection of statements that perform a certain task
// functions are used to put repeated task into a single function
// it is a object which can be stored in a variable
// method always belongs to a class which has name, signature bytecode etc
// last statement is return statement

// creating class
class demoFunction {
	// defining function
	def funToAdd(a:Int, b:Int) : Int = {
		var sum : Int = 0
		sum = a + b
		return sum
	}

	// square of number
	def square(x:Double) : Double = {
		x * x
	}

	// multiplication of number
	def multiplication(x:Int, y:Int, z:Int) : Int = x*y*z

	// addition of number
	def +(x:Double, y:Double, z:Double) = x+y+z

	// minimum of number
	def minimum(x:Int, y:Int, z:Int) : Int = x min y min z

}

// creating object
object MainObject {
	//main method
	def main(args : Array[String]) {
		var s = new demoFunction
		// calling function
		var res = s.funToAdd(10, 20)
		println("Addition is : " + res)
		println(s"Square " + s.square(10))
		println("Multiplication " + s.multiplication(2, 2, 3))
		println("Addtion " + s.+(2, 2, 3))
		println("Minimun " + s.minimum(1, 2, 3))
	}
}

/*

In general, function declaration & definition have 6 components:

1. def keyword: “def” keyword is used to declare a function in Scala.

2. function_name: It should be valid name in lower camel case.
Function name in Scala can have characters like +, ~, &, –, ++, \, / etc.

3 . parameter_list: In Scala, comma-separated list of input parameters 
are defined, preceded with their data type, within enclosed parenthesis.

4. return_type: User must mention return type of parameters while defining
function and return type of a function is optional.
If you don’t specify any return type of a function, default return type 
is Unit which is equivalent to void in Java.

5. = : In Scala, a user can create function with or without = (equal) 
operator. If the user uses it, the function will return the desired value.
If he doesn’t use it, the function will not return any value and will 
work like a subroutine.

6. Method body: Method body is enclosed between braces { }. The code you 
need to be executed to perform your intended operations.

*/

