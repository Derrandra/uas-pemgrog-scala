/*
    membaca N nama lengkap mahasiswa kemudian
    mengurutkan berdasarkan nama belakang berupa 
    sentence case
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val nama = (1 to n).map(_ => readLine()).toList.sortBy(_.split(" ").last.toLowerCase())
        nama.foreach(println)
    }
}