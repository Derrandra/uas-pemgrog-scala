import scala.collection.mutable._
import scala.io.StdIn._

object Main {
  def main (args: Array[String]): Unit = {
    val n = readInt()
    val data = readLine().split(" ").map(_.toInt).toList

    val min = data.min
    val max = data.max
    val oddSum = data.filter(_ % 2 != 0).sum

    print(s"$min $max $oddSum")
  }
}