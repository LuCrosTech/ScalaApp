<<<<<<< HEAD
object Factorial {
	def main(args: Array[String]) {
		def factorial(num : BigInt = 1) : BigInt = {
			if (num <= 1) 
				1
			else
				num * factorial (num-1)
		}
		println("Factorial of 3 = " + factorial (3))
	}
=======
object Factorial {
	def main(args: Array[String]) {
		def factorial(num : BigInt = 1) : BigInt = {
			if (num <= 1) 
				1
			else
				num * factorial (num-1)
		}
		println("Factorial of 3 = " + factorial (3))
	}
>>>>>>> origin/master
}