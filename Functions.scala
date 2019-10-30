// create function
def square(x:Double) = x * x

// call function
println(s"Square " + square(10))

def mul3(x:Double, y:Double, z:Double):Double = x*y*z
def sum3(x:Double, y:Double, z:Double):Double = x+y+z
def min3(x:Double, y:Double, z:Double):Double = x min y min z

println("Multiplication " + mul3(2, 2, 3))
println("Addtion " + sum3(2, 2, 3))
println("Minimun " + min3(1, 2, 3))

// lambda function
val f = (x:Double) => x*x
println(f(5))

// higher order function
def combine3(x:Double, y:Double, z:Double, 
			 f:(Double, Double)=>Double):Double = f(f(x,y), z)
println("Addtion " + combine3(2, 2, 3, (x,y)=>x+y))
println("Addtion " + combine3(2, 2, 3, _+_))
println("Multiplication " + combine3(2, 2, 3, _*_))
println("Minimum " + combine3(1, 2, 3, _ min _))
println("Maximum " + combine3(1, 2, 3, _ max _))