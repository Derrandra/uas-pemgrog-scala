/*
    Diberikan sebuah paragraf. Buat program untuk
    menemukan statistik kata pada paragraf:
    - jumlah total kata
    - rata-rata panjang kata
    - kata terpanjang
    - kata paling sering muncul
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val a = readLine()
            .toLowerCase
            .replaceAll("[^a-z0-9\\s]", " ")
        val words = a.split("\\s+")
        
        val total = words.length
        println(s"Jumlah total kata: $total")

        val avg = words.map(_.length).sum.toDouble / total
        println(f"Rata-rata panjang kata: $avg%.2f")

        val longest = words.maxBy(x => (x.length, -x.head))
        println(s"Kata terpanjang: $longest")

        val freq = words.groupBy(identity).mapValues(_.size)
            .toList
            .sortBy(x => (-x._2,x._1))
            .head._1
        println(s"Kata paling sering muncul: $freq")
    }
}