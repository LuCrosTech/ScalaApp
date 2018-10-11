object Iam {
	def main(args: Array[String]) {
	
		val name = "Luis"
        val lastName = "Mel"
		val age = 39
		val weight = 235.5
		
		println(s"Hello $name $lastName $age")
		
		println(f"I am ${age + 1} and weight $weight%.2f")
		
		printf("'%5d'\n", 5)
		printf("'%-5d'\n", 5)
		
		printf("'%05d'\n", 5)

		printf("'%.5f'\n", 3.14)
		
		printf("'%-5s'\n", "hi")
	}
}