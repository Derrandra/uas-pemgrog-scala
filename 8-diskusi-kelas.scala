import scala.io.StdIn._

object SimpleCalculator {
    def main (args: Array[String]): Unit = {
        val add = (a:Double, b:Double) => a + b
        val subtract = (a:Double, b:Double) => a - b
        val multiply = (a:Double, b:Double) => a * b
        val divide = (a:Double, b:Double) => a / b

        println("Enter two numbers: ")
        val a = readDouble()
        val b = readDouble()

        print("What to do?: ")
        val n = readLine()
        n match {
            case "add" => print(add(a, b))
            case "subtract" => print(subtract(a, b))
            case "multiply" => print(multiply(a, b))
            case "divide" => print(divide(a, b))
            case _ => println("Unknown operation.")
        }
    }
}