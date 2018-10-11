<<<<<<< HEAD
import java.io.PrintWriter
import scala.io.Source

object FileIOTut {
	def main (args: Array[String]) {
		val writer = new PrintWriter("test.txt")
		writer.write("Just some random text\nSome more random text")
		writer.close
		
		var textFromFile = Source.fromFile("test.txt", "UTF-8")
		
		val lineIterator = textFromFile.getLines
		
		for (line <- lineIterator)
			println(line)
			
		textFromFile.close()
	}
=======
import java.io.PrintWriter
import scala.io.Source

object FileIOTut {
	def main (args: Array[String]) {
		val writer = new PrintWriter("test.txt")
		writer.write("Just some random text\nSome more random text")
		writer.close
		
		var textFromFile = Source.fromFile("test.txt", "UTF-8")
		
		val lineIterator = textFromFile.getLines
		
		for (line <- lineIterator)
			println(line)
			
		textFromFile.close()
	}
>>>>>>> origin/master
}