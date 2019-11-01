// scala program for closure function

/* 

1. Functions which uses one or more free variables and 
the return value of this function is dependent of these variable.

2. The free variables are defined outside of the Closure Function and
is not included as a parameter of this function.

3. Free variable is any kind of variable which is not defined within
the function andnot passed as the parameter of the function

4. A free variable is not bound to a function with a valid value and 
function does not contain any values for the free variable.

5. It takes the most recent state of the free variable and changes the
value of the closure function accordingly.

6. A closure function can further be classified into pure and impure
functions, depending on the type of the free variable.

7. If we give the free variable a type var then the variable tends to
change the value any time throughout the entire code and thus may
result in changing the value of the closure function.
Thus this closure is a impure function.

8. On the other-hand if we declare the free variable of the type val then
the value of the variable remains constant and thus making the closure
function a pure one.

*/

// creating class
class ClosureFunction {
	// defining free var 
	var number = 10

	// defining sum
	def sum1(a:Int) = {
		a + number
	}
	// defining function and changing number
	def sum2(a:Int) = {
		number = a + number
		number
	}
}

// creating object
object MainObject {
	// main function
	def main(args : Array[String]) {
		var s = new ClosureFunction()
		// calling sum1
		println("Sum1 is : " + s.sum1(10))
		println("Sum1 is : " + s.sum1(20))

		// calling sum2
		println("Sum2 is : " + s.sum2(10))
		println("Sum2 is : " + s.sum2(20))
	}
}