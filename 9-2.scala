import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val arr = readLine().split(" ").map(_.toInt).toList
        
        println(arr.filter(x => {
            val sqrt = math.sqrt(x)
            sqrt == sqrt.toInt
        }).sum)
    }
}