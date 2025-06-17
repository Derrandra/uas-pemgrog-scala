/*
    Menerima input berupa deret sembarang bilangan bulat
    dan menghitung banyaknya faktor dari setiap bilangan
    yang ada. Faktor dari N adalah banykanya bilangan 1 sampai
    dengan N yang habis membagi N.

    Contoh Input:
    4
    5 8 2 3

    Contoh Output:
    2 -> 2
    3 -> 2
    5 -> 2
    8 -> 4
*/
import scala.io.StdIn._

object Main {
    def sumFaktor (x: Int): Int = {
        (1 to x).count(x % _ == 0)
    }

    def main (args: Array[String]): Unit = {
        val n = readInt()
        val num = readLine().split(" ").map(_.toInt).toList.sorted
        num.foreach{ x =>
            val count = sumFaktor(x)
            println(s"$x -> $count")
        }
        
    }
}