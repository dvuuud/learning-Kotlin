fun main(){
    var counter = 7
//    while (counter > 0){
//        println("Считается ${counter--}") // --> Это цикл while в котлине он чем то схож с пайтонским
//        Thread.sleep(1000)
//    }
//    do{
//        println("${counter--}")
//        Thread.sleep(1000)
//    } while (counter > 0 )
//     // Диапазона и цикл For
//    var range = 42..442
//    var range2 = 42 until 442
//// Это два вида диапазаона в котлине можно писать двумя способами
//// Диапазоны могут быть, соответственно, определенных типов. Например, Long, символный тип Char, Double и Float.
//    val range3 = 42L..442L
//    val range4 = 'a'..'z'
//    val range5 = 42.1..442.1
//    val range6 = 42.1f..442.1f
//    val a = 52 in range
//    val b = 43 !in range
//    println("$a, $b")
    for (i in 7 downTo 1){
        println("закончится через $i")
        if(i == 1)
            println("Реклама закончилась")
    }
    for (i in 5 downTo 1) {
        if(i == 3) {
            println("Пользователь нажал на кнопку \"Пропустить\"")
            break
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
}

