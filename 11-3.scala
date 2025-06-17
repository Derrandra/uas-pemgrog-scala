/*
    Sistem Pencari IPK. Terdapa N baris berisi NIM, matkul,
    dan mutu yang dipisahkan dengan tanda koma plus spasi
    (, ).
*/

import scala.io.StdIn._
import scala.collection.mutable

object Main {
    def main(args: Array[String]): Unit = {
        val angkaMutu = Map[String, Double](
            "A" -> 4.0,
            "AB" -> 3.5,
            "B" -> 3.0,
            "BC" -> 2.5,
            "C" -> 2.0,
            "D" -> 1.0,
            "E" -> 0
        )

        val mhs = mutable.Map[String, (String, Double, Int)]()

        val n = readInt()
        for(i <- 1 to n){
            var inp = readLine().split(", ").toList
            var nim = inp(0)
            var name = inp(1)
            var matkul = inp(2)
            var mutu = inp(3)

            var nilai: Double = angkaMutu(mutu)

            if(mhs.contains(nim)){
                val (nama, totalNilai, jumlahMK) = mhs(nim)
                mhs(nim) = (nama, totalNilai + nilai, jumlahMK + 1)
            } else {
                mhs(nim) = (name, nilai, 1)
            }
        }
        
        val mhsUrut = mhs.toList.sortBy(_._1)

        mhsUrut.foreach{
            case (nim, (nama, totalNilai, jumlahMK)) =>
                var ipk = totalNilai / jumlahMK
                println(f"$nama $ipk%.2f")
        }
    }
}