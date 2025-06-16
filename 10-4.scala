/*
    Mencari kata pada dua teks. Temukan semua kata
    yang ada di kedua teks, kata tidak case sensitive,
    print output sesuai abjad.
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val a = readLine().toLowerCase.split("\\s+").toSet
        val b = readLine().toLowerCase.split("\\s+").toSet

        val res = (a intersect b).toList.sorted
        println(res.mkString(" "))
    }
}