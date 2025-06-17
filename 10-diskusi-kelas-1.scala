/*
    Buat program Scala yang menerima input berupa deret
    sembarang bilangn bulat, dan menghitung frekuensi
    kemunculan setiap bilangan. Output diurutkan menurut
    bilangannya.

    Contoh Input:
    9
    1 5 8 2 5 5 1 2 3

    Contoh Output:
    1 -> 2
    2 -> 2
    3 -> 1
    5 -> 3
    8 -> 1    
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        val num = readLine().split(" ").map(_.toInt).toList

        val freq = num.groupBy(identity)
            .map{case(a, b) => (a, b.length)}
            .toList
            .sorted
        freq.foreach{
            case (a, b) => println(s"$a ->   b                        $b")
           }
        }

}

