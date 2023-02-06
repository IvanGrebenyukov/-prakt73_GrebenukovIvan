import kotlin.math.*
fun main()
{
    Zadanie4_2()
}
fun Zadanie4_2() {
    while (true)
    {
        try
        {
            print("Введите x: ")
            var x: Double = readLine()!!.toDouble()
            print("Введите y: ")
            var y: Double = readLine()!!.toDouble()
            print("Введите z: ")
            var z: Double = readLine()!!.toDouble()
            when
            {
                (y < 0) ->
                {
                    var max: Double = Math.max(x,y)
                    var U: Double = Math.min(z, max)
                    println("Ответ = $U")
                }
                (y >= 0) ->
                {
                    var min: Double = Math.min(x,y)
                    var U: Double = Math.max(z, min)
                    println("Ответ = $U")
                }
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}