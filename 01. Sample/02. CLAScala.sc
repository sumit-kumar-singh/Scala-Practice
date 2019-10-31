// scala program for command line agruments demo

// arguments which are passed by the user to the main() method are CLI arg
// main() method is the entry point of execution of a program
// main() method accepts an array of strings at runtime
// but it never accepts parameters from any other method in the program

// creating object
object CLIExample {
    // main method 
    def main(args: Array[String]) {
    	// message
        println("Scala Command Line Argument Example")
        
        // You pass any thing at runtime that will be print on the console 
        for(arg<-args) { 
            println(arg)
        }

        // print as array items
        println(args(0));
        println(args(2));
    }
}

// open CMD 
// run --> scala 02.CLAScala.sc 1 Hello Scala
