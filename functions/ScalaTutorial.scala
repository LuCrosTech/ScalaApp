<<<<<<< HEAD
object ScalaTutorial {
	def main(args: Array[String]) {
		var i = 0
		
		while (i <= 10) {
			println(i)
			i += 1
		}
		
		do {
			println(i)
			i += 1
			} while (i<=20)
			
			
		for (i <-1 to 10)
			println(i)
			
		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		
		for (i <- 0 until randLetters.length)
			println(randLetters(i))
	
		val aList = List(1,2,3,4,5)
		for (i <- aList) {
			println("List items " + i)
		}
		
		
		var evenList = for { i <-1 to 20
			if (i %2) == 0
			} yield i
		for (i <- evenList)
			println(i)
			
			
		for ( i <- 1 to 5; j <- 6 to 10) {
			println("i : " +i)
			println("j : " +j)
		}

		def printPrimes() {
			val primeList = List(1,2,3,5,7,11)
			for (i <- primeList) {
				if (i == 11) {
					return
				}
				if (i != 1) {
				println (i)
				}
			}
		}
		printPrimes
	}
}
=======
object ScalaTutorial {
	def main(args: Array[String]) {
		var i = 0
		
		while (i <= 10) {
			println(i)
			i += 1
		}
		
		do {
			println(i)
			i += 1
			} while (i<=20)
			
			
		for (i <-1 to 10)
			println(i)
			
		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		
		for (i <- 0 until randLetters.length)
			println(randLetters(i))
	
		val aList = List(1,2,3,4,5)
		for (i <- aList) {
			println("List items " + i)
		}
		
		
		var evenList = for { i <-1 to 20
			if (i %2) == 0
			} yield i
		for (i <- evenList)
			println(i)
			
			
		for ( i <- 1 to 5; j <- 6 to 10) {
			println("i : " +i)
			println("j : " +j)
		}

		def printPrimes() {
			val primeList = List(1,2,3,5,7,11)
			for (i <- primeList) {
				if (i == 11) {
					return
				}
				if (i != 1) {
				println (i)
				}
			}
		}
		printPrimes
	}
}
>>>>>>> origin/master
