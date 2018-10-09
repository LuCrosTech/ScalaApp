object ClassesTut {
	def main(args : Array[String]) {
		
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("Woof")
		printf("%s says %s\n", rover.getName, rover.getSound)
		
		val whiskers = new Animal("Whiskers", "Meow")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.sound}")
	
		println(whiskers.toString)
		
		val spike = new Dog("Spike", "Woof", "Grrr")
		spike.setName("Spike")
		
		println(spike.toString)
	
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)
	
	}  // END OF MAIN
	
	class Animal(var name: String, var sound: String) {
		this.setName(name)
		
		val id = Animal.newIdNum
		
		def getName() : String = name
		def getSound() : String = sound
		
		def setName(name : String) {
			if (!(name.matches(".*\\d+.*")))
				this.name = name
			else
				this.name = "No Name"
		}
		
		def setSound(sound: String) {
			this.sound = sound
		}
		
		def this(name : String) {
			this("No Name", "No Sound")
			this.setName(name)
		}
		
		def this() {
			this("No Name", "No Sound")
		}
		
		override def toString() : String = {
			return "%s with the id %d says %s".format(this.name, this.id, this.sound)
		}
	}
	
	object Animal {
		private var idNumber = 0
		private def newIdNum = { idNumber += 1; idNumber}
	}
	
	class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
		def this(name: String, sound: String) {
			this("No Name", sound, "No Growl")
			this.setName(name)
		}
		
		def this(name: String) {
			this("No Name", "No Sound", "No Growl")
			this.setName(name)
		}
		
		def this() {
			this("No Name", "No Sound", "No Growl")
		}
		
		override def toString(): String = {
			return "%s with the id %d says %s and %s".format(this.name, this.id, this.sound, this.growl)
		}
	
	}

	
	abstract class Mammal(val name : String) {
		var moveSpeed : Double
		
		def move : String
	}
	
	class Wolf (name: String) extends Mammal(name) {
		var moveSpeed = 35.0
		
		def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
	}
	
} // END OF ClassesTut