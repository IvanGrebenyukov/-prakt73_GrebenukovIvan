import java.math.RoundingMode
import java.text.DecimalFormat

fun main()
{
    Zadanie14_2()
}
fun Zadanie14_2() {
    while (true)
    {
        try
        {
            print("Введите a: ")
            var a: Double = readLine()!!.toDouble()
            print("Введите b: ")
            var b: Double = readLine()!!.toDouble()
            print("Введите c: ")
            var c: Double = readLine()!!.toDouble()
            var discriminant: Double = (Math.pow(b, 2.0)) - (4 * a * c)
            var y1: Double = ((-b) + Math.sqrt(discriminant)) / (2*a)
            var y2: Double = ((-b) - Math.sqrt(discriminant)) / (2*a)
            var x1: Double = -Math.sqrt(y1)
            var x2: Double = -Math.sqrt(y2)
            var x3: Double = Math.sqrt(y1)
            var x4: Double = Math.sqrt(y2)
            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.DOWN
            println("Корни биквадратного уравнения: x1 = ${(df.format(x1))} ; x2 = ${(df.format(x2))} ; x3 =${(df.format(x3))} ; x4 = ${(df.format(x4))}")
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}