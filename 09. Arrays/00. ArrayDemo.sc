// scala program for array declaration

/*

1. Array is a collection of mutable values.

2. It is an index based data structure which starts from 0 index to n-1
where n is length of array.

3. Types of array :
    - Single dimensional array
    - Multidimensional array

*/

// creating object
object MainObject {
	// main function
	def main(args : Array[String]) {
		// way 1
		var array1 = Array(1, 2, 3)

		// way 2
		var array2 : Array[Int] = new Array[Int](3)

		// way 3
		var array3 = new Array[Int](3)

		// way 4
		var array4 : Array[Int] = new Array(3)

		// accessing array1
		println("First element is : " + array1(0))
		var lenghtArray1 = array1.length - 1
		println("Last element is : " + array1(lenghtArray1))
		println("Elements of Array1 is : ")
		for(a <- array1) {
			println(a)
		}

		// accessing array2
		println("First element is : " + array2(0))
		var lenghtArray2 = array2.length - 1
		println("Last element is : " + array2(lenghtArray2))
		println("Elements of Array2 is : ")
		for(a <- array2) {
			println(a)
		}
		println("These are default value of Int")
		// adding elements to array2
		array2(0) = 10
		array2(1) = 20
		array2(2) = 30
		println("Elements of Array2 is after insertion : ")
		for(a <- array2) {
			println(a)
		}
		println("Last element is : " + array2(lenghtArray2))

		// accessing array3
		println("First element is : " + array3(0))
		var lenghtArray3 = array2.length - 1
		println("Last element is : " + array3(lenghtArray3))
		println("Elements of Array3 is : ")
		for(a <- array3) {
			println(a)
		}
		// adding elements to array3
		array3(0) = 40
		array3(1) = 50
		array3(2) = 60
		println("Elements of Array3 is after insertion : ")
		for(a <- array3) {
			println(a)
		}
		println("Last element is : " + array3(lenghtArray3))

		// accessing array4
		println("First element is : " + array4(0))
		var lenghtArray4 = array4.length - 1
		println("Last element is : " + array4(lenghtArray4))
		println("Elements of Array4 is : ")
		for(a <- array4) {
			println(a)
		}
	}
}