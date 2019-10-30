// using trycatch
import io.StdIn._

def safeReadInt:Int = {
	try {
		println("Enter Number")
		readInt
	} catch {
		case e:NumberFormatException =>
			println("Invalid input. Please try again!")
			safeReadInt
	}
}

// calling function
var i = safeReadInt
println("Output " + i)