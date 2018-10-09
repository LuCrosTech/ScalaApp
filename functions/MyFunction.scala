object MyFunction {
	def main(args: Array[String]) {
		
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			num1 + num2
		}
		
		println(" 5 + 4 = " + getSum(5,4))
		println("default sum = " + getSum())
		
		println("5 + 4 = " + getSum(num2 = 4, num1 = 5))
		
		def sayHi() : Unit = {
		println("Hi how are you")
		}
		
		sayHi
		
		def getSumArr(args: Int*): Int = {
			var sum : Int = 0
			for ( num <- args) {
				sum += num 
			}
			sum
		}
		println("Get sum arr" + getSumArr(1, 2, 3, 4, 5, 6))
	}
}