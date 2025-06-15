/*
    fungsi untuk mencari sebuah nilai dari sebuah
    deret sembarang bilangan bulat. output 1 jika
    ditemukan, dan 0 jika tidak ditemukan
*/

import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        var num = ListBuffer[Int]()

        for(_ <- 1 to n){
            var x = readInt()
            num += x
        }

        print("Masukkan angka yang ingin dicari: ")
        val target = readInt()

        if(num.filter(_ == target).length > 0) print(1) else print(0)
    }
}