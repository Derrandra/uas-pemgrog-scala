import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val num = ListBuffer[Double]()
        for(x <- 1 to n){
            var x = readDouble()
            num += x
        }

        val y = num.filter(x => x >= 0 && x <= 100)
        val mean: Double = y.sum / y.length
        println(y)
        println(mean + " " + y.length)
        val sumSquare = y.map(x => math.pow(x - mean, 2)).sum
        printf("%.2f", sumSquare / y.length)
    }
}