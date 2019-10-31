# Scala Programming Language
## This repo is about scala programming language.
Scala is general-purpose programming language and supports object oriented, functional and imperative programming approaches.
It is a strong static type language. In scala, everything is an object whether it is a function or a number. 
It does not have concept of primitive data. File extension of scala source file may be either .scala or .sc.
You can create any kind of application like web application, enterprise application, mobile application, desktop based app.

1. Scala is acronym for Scalable Language.
2. Statically Typed - in this a var has type and can hold value of that type and type error is caught by compiler.
3. Runs on JVM, full inter-op with java means java and scala code can be used interchangably.
4. Object Oriented, Functional and Dynamic Features.
5. Scala blends object oriented and functional programming in a statically typed language.

### There are following features of scala:

1. Type inference - 
In Scala, you don't require to mention data type and function return type explicitly. 
Scala is enough smart to deduce the type of data.
The return type of function is determined by the type of last expression present in the function.

2. Singleton object - 
In Scala, there are no static variables or methods. 
Scala uses singleton object, which is essentially class with only one object in the source file. 
Singleton object is declared by using object instead of class keyword.

3. Immutability -
Scala uses immutability concept. Each declared variable is immutable by default.
Immutable means you can't modify its value.
You can also create mutable variables which can be changed.
Immutable data helps to manage concurrency control which requires managing data.

4. Lazy computation - 
In Scala, computation is lazy by default. Scala evaluates expressions only when they are required.
You can declare a lazy variable by using lazy keyword. It is used to increase performance.

5. Case classes and Pattern matching - 
Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
All the parameters listed in the case class are public and immutable by default.
Case classes support pattern matching. So, you can write more logical code.

6. Concurrency control and Distributed - 
Scala provides standard library which includes the actor model. You can write concurrency code by using actor.
Scala provides one more platform and tool to deal with concurrency known as Akka.
Akka is a separate open source framework that provides actor-based concurrency.
Akka actors may be distributed or combined with software transactional memory.

7. String interpolation - 
Scala offers a new mechanism to create strings from your data. It is called string interpolation. 
String interpolation allows users to embed variable references directly in processed string literals.
Scala provides three string interpolation methods: s, f and raw.

8. Higher order function - 
Higher order function is a function that either takes a function as argument or returns a function.
In other words, we can say a function which works with another function is called higher order function.
Higher order function allows you to create function composition, lambda function or anonymous function etc.

9. Traits - 
A trait is like an interface with a partial implementation.
In Scala, trait is a collection of abstract and non-abstract methods.
You can create trait that can have all abstract methods or some abstract and some non-abstract methods.

10 Rich collection set - 
Scala provides rich set of collection library. It contains classes and traits to collect data.
These collections can be mutable or immutable. You can use it according to your requirement.
Scala.collection.mutable package contains all the mutable collections.
You can add, remove and update data while using this package.
Scala.collection.immutable package contains all the immutable collections. It does not allow you to modify data.

### Execution
You must have latest jdk installed on your machine because scala compiler creates .class file which is a byte code.
Scala interpreter executes this byte code by using jvm (Java Virtual Machine).

The following code example is a simple scala program.
object ScalaExample{  
    def main(args:Array[String]){  
        println "Hello Scala"  
    }  
}  
In the above code, we have created an object ScalaExample.
It contains a main method and display message using println method.

This file is saved with the name ScalaExample.scala.
Command to compile this code is: scalac ScalaExample.scala
Command to execute the compiled code is: scala ScalaExample

Below is the example by using functional approach.

def scalaExample{  
    println("Hello Scala")  
}
// Calling of function
scalaExample

### Where to use Scala

1. Web applications
2. Utilities and libraries
3. Data streaming with Kafka
4. Parallel batch processing
5. Concurrency and distributed application
6. Data analysis with Spark
7. AWS lambda expression
8. Ad hoc scripting in REPL etc

### SBT (Scala Build Tool)
1. Build tool provides facility to compile, run, test and package your projects.
2. sbt is an open source build tool for Scala and Java projects, similar to Java's maven and ant.

