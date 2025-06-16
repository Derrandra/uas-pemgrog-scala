/*
    Diberikan n pasangan kata. Tentukan
    apakah pasangan tersebut berupa anagram.
*/

import scala.io.StdIn._

object Main {
    def main (args: Array[String]): Unit = {
        val n = readInt()
        (1 to n).foreach{_ =>
            var pasangan = readLine()
                .toLowerCase
                .split(":")
                .map(_.trim)
            println("ini pasangannya: " + pasangan.mkString("[", ", ", "]"))
            var (a, b) = (pasangan(0), pasangan(1))
            if (a.sorted == b.sorted) println("Anagram") else println("Bukan Anagram")
        }
    }
}