// Variable is a name which is used to refer memory location
// You can create mutable and immutable variable in scala.
// creating variables using var
// var are mutable varibales which can be changed
// datatypes list -
/*
	Boolean		true or false
	Byte 		8 bit signed value
	Short		16 bit signed value
	Char		16 bit unsigned Unicode Character
	Int			32 bit signed value
	Long		64 bit signed value
	Float		32 bit single-precision float
	Double		64 bit double-precision float
	String		A sequence of characters

	Unit		Corrosponds to no value
	Null		Null or empty refrence
	Nothing		Subtype of every other type
	Any			Supertype of any type
	AnyRef		Supertype of any reference type

Default value of Boolean is false and for String is Null

Rules for naming variable in Scala

Variable name should be in lower case.
Variable name can contain letter, digit and two special characters
Allowed special characters are (Underscore(_) and Dollar($) sign)
Variable name must not contain the keyword or reserved word.
Starting letter of the variable name should be an alphabet.
White space is not allowed in variable name.

*/


// var is a keyword and age is a variable name
var age : Int = 25
println("Before - Age is : " + age)

// changing age 
age = age + 5
println("After - Age is : " + age)

// displays format string 
printf("Format String - Age is : %d", age) 