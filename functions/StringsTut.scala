<<<<<<< HEAD
object StringsTut {
	def main(args: Array[String]) {
		var randSent = "I saw a dragon fly by"
		println("3rd index: " + randSent(3))
		println("Length: " + randSent.length)
		println(randSent.concat( " and explode"))
		println("Equals: " + "I saw a dragon".equals(randSent))
		println("dragon starts index " + randSent.indexOf("dragon"))
		
		val randSentArray = randSent.toArray
		
		for (v <- randSentArray)
			println(v)
	}
=======
object StringsTut {
	def main(args: Array[String]) {
		var randSent = "I saw a dragon fly by"
		println("3rd index: " + randSent(3))
		println("Length: " + randSent.length)
		println(randSent.concat( " and explode"))
		println("Equals: " + "I saw a dragon".equals(randSent))
		println("dragon starts index " + randSent.indexOf("dragon"))
		
		val randSentArray = randSent.toArray
		
		for (v <- randSentArray)
			println(v)
	}
>>>>>>> origin/master
}