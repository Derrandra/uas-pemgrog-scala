/*
    program membaca N string lalu 
    kelompokkan nama-nama tersebut berdasarkan
    panjangnya. urutan output sesuai jumlah.
*/

import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val nama = (1 to n).map(_ => readLine()).toList.groupBy(_.length).toList.sortBy(_._1)
        nama.foreach{
            case(len, group) => println(s"$len: ${group.mkString(", ")}")
        }
    }
}