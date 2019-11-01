// scala program for multi-dimensional array

// array with more than one-dimension, rows and columns
// synatx - val names = Array.ofDim[String](rows, cols)
// creating class
class MultiDimensionalArrary {
	// multi-dimensional array
	var mulArray2D = Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8))
	var mulArray3D = Array(Array(1, 2), Array(5, 6), Array(3, 4))

	// accessing elements
	def show3D() {
		println("3D Array is : ")
		for(i <- 0 to 2) {
			for(j <- 0 to 1) {
				print(" " + mulArray3D(i)(j))
			}
			println()
		}
	}

	def show2D() {
		println("2D Array is : ")
		for(i <- 0 to 1) {
			for(j <- 0 to 3) {
				print(" " + mulArray2D(i)(j))
			}
			println()
		}
	}
}

// creating object
object MainObject {
	// main function
	def main(args : Array[String]) {
		var s = new MultiDimensionalArrary()
		s.show2D()
		s.show3D()
	}
}