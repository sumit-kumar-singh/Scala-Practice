// evaluating expression and statement
// you can add any number of var/val inside {}
// the last statement should be evaluating one

// demo
val x = {val A : Int = 200 ; val B : Int = 300 ; A + B}
println("Evaluating x returns : " + x)

// linebreak or semicolon can be used as termination delimitor
val y = { val C : Int = 200
		  val D : Int = 300
		  C + D
		}
println("Evaluating y returns : " + y)

// multiple assignments 
val(age:Int, name:String) = pair(2, "Sumit Kumar")
println(age)
println(name)