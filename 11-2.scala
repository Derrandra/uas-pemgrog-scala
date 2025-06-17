/*
    M baris dengan N bilbul sebagai representasi
    matriks berdimensi M*N. Buat program untuk 
    transpose matriks tersebut.
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val Array(m, n) = readLine().split(" ").map(_.toInt)
        val rows = (1 to m).map(_ =>
            readLine().split(" ").map(_.toInt)
        )

        val transposed = Array.ofDim[Int](n, m)

        for (i <- 0 until m; j <- 0 until n){
            transposed(j)(i) = rows(i)(j)
        }

        transposed.foreach(row => println(row.mkString(" ")))
    }
}