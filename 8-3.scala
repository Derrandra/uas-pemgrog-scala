import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
    val n = readInt()

    def faktorial(x: Int): Int = {
        if (x <= 1) 1
        else x * faktorial(x - 1)
    }  

    println(faktorial(n))
    }
}