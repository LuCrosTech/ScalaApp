import scala.util.control.Breaks._

object FindRepited {
    def main (args: Array[String]) {
    
    val numbers = Array (4, 9, 6, 7, 8, 9, 10)
    
    numbers.foreach(println)    
        
    for (i <- 0 until numbers.length)
        for (j <- i+1 until numbers.length)
            if (numbers(i) == numbers(j)) {
             println(s"repeated number ${numbers(i)} in position ${i} and ${j}")
            }
    
    

//    val numbers1 = Array (4, 9, 6, 7, 8, 9, 10)
    println(s"**** Another way **** ${numbers.length}")    
    
    
    val uniqueNumbers = scala.collection.mutable.Set[Int]()
    
    for (i <- 0 until numbers.length)
        if ((uniqueNumbers.add(numbers(i))) == false) {
            println(s"repeated number ${numbers(i)} in position ${i}")
        }
    }
}
            