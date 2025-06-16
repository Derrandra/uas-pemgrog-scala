/*
    Diberikan sejumlah orang dan hubungan satu arah
    di mana setiap hubungan menunjukkan teman favorit.
    Hubungan ini ditulis dalam bentuk A > B yang 
    berarti A menganggap B sebagai teman favoritnya.
    Dapat dipastikan bahwa setiap orang maksimal memiliki
    satu teman favorit. 

    Tentukan yang bukan favorit siapa-siapa
*/

import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val all = Set[String]()
        val fav = Set[String]()

        (1 to n).foreach{_ =>
            val ab = readLine().split(">").map(_.trim)
            all += ab(0)
            all += ab(1)
            fav += ab(1)
        }

        val res = (all diff fav).toList.sorted
        println(res.mkString(" "))
    }
}
