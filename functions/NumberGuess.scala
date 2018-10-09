import scala.io.StdIn.{readLine, readInt}
import scala.math._



object NumberGuess {
	def main(args: Array[String]) {
	
		var numberGuess = 0

		do {
			print("Guess a number ")
			numberGuess = readLine.toInt
			//numberGuess = scala.io.StdIn.Int
			
		} while (numberGuess != 15)
		
		printf("You guessed the secret number %d\n", 15)
		
	}
}