/*
    Diberikan M, N. M baris berisi N bilbul. Buat
    program untuk menghitung berapa banyak dari 
    kelompok bil setiap baris yang tidak ada dupenya
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val Array(m, n) = readLine().split(" ").map(_.toInt)
        val rows = (1 to m).map(_ =>
            readLine().split(" ").map(_.toInt)
        )
        val res = rows.count(row => row.distinct.size == row.size)
        println(res)
    }
}