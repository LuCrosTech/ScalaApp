object ScratchTest {
	def main (args: Array[String]) {
		println("# JavaOne #")
		
		val time1 = new Time(8,40)
		println(time1)
		
		val time2 = new Time(8, 46)
		println(time2)
		
		println(time2.minus(time1))
		
		println(time2  - time1)
	}

}