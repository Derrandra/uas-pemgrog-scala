/*
    fungsi untuk menghitung banyak nama yang
    memiliki a kata dari deret sejumlah
    nama orang
*/

import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        var nama = ListBuffer[String]()

        for (_ <- 1 to n){
            var x = readLine()
            nama += x
        }

        print("berapa kata?: ")
        val a = readInt()

        // \\s+ itu buat representasi whitespace
        val sum = nama.count(nama => nama.trim.split("\\s+").length == a)
        println(sum)
    }
}