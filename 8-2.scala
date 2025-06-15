import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val arr1 = readLine().split(" ").map(_.toInt.abs).toList
        val arr2 = readLine().split(" ").map(_.toInt.abs).toList
    
        println(arr1.max)
        println(arr2.max)
        println(arr1.max * arr2.max)
    }
}