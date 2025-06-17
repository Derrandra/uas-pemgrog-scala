import scala.collection.mutable
import scala.io.StdIn._

object Main {
    def main(args: Array[String]): Unit = {
        val inp = readLine().split(" ").map(_.toInt).takeWhile(_ != -1).toList

        val freq = mutable.Map[Int, Int]()

        inp.foreach {pos =>
            freq(pos) = freq.getOrElse(pos, 0) + 1    
        }

        val hasil = freq.toList.sortBy(_._1).map(_._2)
        println(hasil.mkString(", "))
    }
}