//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Kotlin the best!")
    val number: Int = 42 // к пременной val нельзя дальше присваивать значение
    var str: String = "Johnson"
    str = "Это я" // а к var можно
    //var firstChar: Char = 'В тип данныых char можно писать с одинарными кавычками'
    var isTrue: Boolean = false //Сравнение true false
    val num: Float = 4.7f //К типу данных float нужно в конце добавлять букву 'f'
    val bool = num > number // сравнение в котлине
    var nums: Double = 1.2232434 // в Double можно писать неограниченное количество цифр после точки
    var age: Int? = null // Вопрос служит для того что бы могли здесь добавить либо значение либо здесь остается null

    println("Число равен $number") // $ это присваивание к строке это еще один вид конкатенации
    println("Число равен" + num) // Это второй способ к присваивание к строке
    println(str)
    println(bool)

    if (num == 4.7f || str == "Это я" ){ // || и && это если мы хотим дать два и более условий
        println("Ваш $num и ваш $str")
    } else{
        println("Неверно")
    } // Это условные операторы в Котлине они как то схожи с Пайтонскими
    val numss: Int = 57
    when(numss){
        null -> println("Переменная равна null")
        10 -> println("Переменная равна 10")
        5 -> println("Переменная равна 57")
        else -> println("переменная не понятна")
    }
}
