import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.*
fun main()
{
    Zadanie4_1()
}
fun Zadanie4_1()
{
    while(true)
    {
        try
        {
            print("Введите сторону a: ")
            var a: Double = readLine()!!.toDouble()
            while(true)
            {
                when{
                    (a < 0) ->
                    {
                        println("Введите число больше 0")
                        a = readLine()!!.toDouble()
                    }
                    else -> break
                }
            }
            print("Введите сторону b: ")
            var b: Double = readLine()!!.toDouble()
            while(true)
            {
                when{
                    (b < 0) ->
                    {
                        println("Введите число больше 0")
                        b = readLine()!!.toDouble()
                    }
                    else -> break
                }
            }
            print("Введите сторону c: ")
            var c: Double = readLine()!!.toDouble()
            while(true)
            {
                when{
                    (c < 0) ->
                    {
                        println("Введите число больше 0")
                        c = readLine()!!.toDouble()
                    }
                    else -> break
                }
            }
            var p: Double = (a + b + c) / 2 //Полупериметр треугольника
            var s: Double = Math.sqrt((p *(p - a) * (p - b) * (p - c))) // Формула герона
            var h: Double = (2 * s) / a //Высота к стороне a
            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.DOWN
            println("Высота к стороне а =  ${(df.format(h))}")
            break
        }
        catch(e: Exception)
        {
            println("Вы ввели не число")
        }
    }

}