fun main() {
    //№1
    val word = "Проснись"
    val word1 = "самурай."
    val word2 = "Время сжечь этот город."
    val space = " "
    println("Задание №1  \n" + word + " уже,"+ word1 + space + word2)
    val str = "это не озеро, это океан"
    var new_str = str.uppercase()
    println("$str\n$new_str")
    println("Кол-во символов " + str.length)

//№2
    val num = 100
    val num2 = 20
    var result = num2 - num * (num / 10) + num2*40
    println("Задание №2  \n$result")
    var x = 10
    val y = x++
    println(x)
    println(y)

//№3
    val word3 = "Москва"
    val word4= "столица"
    println("Задание №3 \n$word3 это $word4 России")
    val word5 = "Вот оно че"
    val word6 ="Михалыч"
    val multiStr= """
                    $word5
                    $word6!
                    """.trimIndent()
    println(multiStr)
//4
val st = ("153")
    val numb = st.toInt()
    println("Задание №4 \n$numb")

//5
if (numb > 100)
{
    println("Задание №5\nYES!")

}
else
{
    println("Задание №5\nNO")
}
//№6
    for (i in 1 downTo 0 )
    {
        println("Задание №6 \nПродолжение через:$i")
        Thread.sleep(1000)
    }
    var ras = 5;
    var count = 2;
    while(ras>0)
    {
        ras-=1
        count += 5
    }
    println("Количество $count")

//№7
fun conechnaia() {
val da = 10+5
    println("Задание №7 \n" + da)
}
//№8
var strArr:Array<String> = arrayOf("Dunstan","Hoffman","Wilburg","Konrad","Larry","DeMarco","Stray")
println("Задание №8\nРазмер массива: ${strArr.size}")
    println("Номер " + strArr.indexOf("Konrad"))

    conechnaia()
}