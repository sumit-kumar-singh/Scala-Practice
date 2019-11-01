// scala program for partially applied functions

// previous functions was fully applied
// in this some param is kept as wildcard to use when required

// importing data library
import java.util.Date

// creating class
class PartialFunc {
	// defining function for log
	def log(date : Date, message : String) = {
		println(date + "	" + message)
	}

	// defining function for sum
	def sum(a:Int, b:Int, c:Int) = {
		println("Sum is : " + (a + b + c))
	}
}

// creating object
object MainObject {
	// main function
	def main(args : Array[String]) {
		var s = new PartialFunc()

		// using log as partial function
		val date = new Date
		val newLog = s.log(date, _:String)
		newLog("Message 1")
		newLog("Message 2")

		// using sum as partial function
		var twoSum = s.sum(20, _:Int, _:Int)
		var oneSum = s.sum(20, 20, _:Int)
		twoSum(20, 20)
		oneSum(20)
	}
}