/*
    buat program membaca N string, lalu
    kelompokkan berdasarkan huruf terakhir dari
    kata dan hitung jumlahnya urutkan output sesuai
    jumlah terbanyak
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val words = (1 to n).map(_ => readLine())
            .toList
            .groupBy(_.last)
            .map{ case (a, b) => (a, b.size)}
            .toList
            .sortBy(x => (-x._2, x._1))
        words.foreach{
            case (c, count) => println(s"$c: $count ")
        }
    }
}