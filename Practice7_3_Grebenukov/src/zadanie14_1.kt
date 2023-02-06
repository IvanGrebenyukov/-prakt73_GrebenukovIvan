fun main()
{
    Zadanie14_1()
}
fun Zadanie14_1()
{
    while(true)
    {
        try
        {
            println("Введите четырехзначное число: ")
            var number: Int = readLine()!!.toInt()
            while((number < 1000 || number > 9999) || (number < -1000 || number < -9999))
            {
                println("Введите четырехзначное число: ")
                number = readLine()!!.toInt()
            }
            var thousand: Int = number / 1000
            var hundred: Int = number / 100 % 10
            var ten: Int = number / 10 % 10
            var unit: Int = number % 10
            var result: Int = thousand + hundred + ten + unit
            println("Сумма цифр числа $number = $result")
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}