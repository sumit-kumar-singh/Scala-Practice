// recursive function for factorial

def factorial(x:Int):Int = if(x<2) 1 else x*factorial(x-1)
println("Factorial " + factorial(5))

// recursive function for sum of sqaure
def sumSquare(n:Int):Int = if(n<2) 1 else n*n + sumSquare(n-1)
// 1^2 + 2^2 = 5
println("Sum of Square " + sumSquare(2))
