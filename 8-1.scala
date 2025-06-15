import scala.collection.mutable._
import scala.io.StdIn._

object Main {
  def main (args: Array[String]): Unit = {
    val n = readInt()
    // val num = readLine().split(" ").map(_.toInt).toList
    val num = ListBuffer[Int]()

    for(_ <- 1 to n){
        var x = readInt()
        num += x
    }

    var minNum = Int.MaxValue
    var maxNum = Int.MinValue
    var sum = 0
    
    for(x <- num){
      if (x < minNum) minNum = x 
      if (x > maxNum) maxNum = x
      if (x % 2 != 0) sum += x
    }
    
     print(s"$minNum $maxNum $sum")
  }
}