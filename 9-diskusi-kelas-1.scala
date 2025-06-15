/*
    Fungsi menerima input berupa deret
    sembarang bilangan bulat, dan menghitung
    jumlah kuadrat dari setiap elemen yang genap
*/
import scala.io.StdIn._
import scala.collection.mutable._

object Main {
    def main (args: Array[String]): Unit = {
        var n = readInt()
        var bilBul = ListBuffer[Int]()

        for(_ <- 1 to n){
            var x = readInt()
            bilBul += x
        }

        var filteredNum = bilBul.filter(_ % 2 == 0).sum
        print(math.pow(filteredNum, 2).toDouble)
    }
}