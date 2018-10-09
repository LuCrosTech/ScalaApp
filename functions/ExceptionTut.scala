object ExceptionTut {
	def main (args: Array[String]) {
		def divideNums(num1 : Int, num2: Int) = try {
			(num1 / num2)
		} catch {
			case ex: java.lang.ArithmeticException => "Can't divide by zero"
		} finally {
		
		}
	
		println("3 / 0 = " + divideNums(3,0))
	
	}

}