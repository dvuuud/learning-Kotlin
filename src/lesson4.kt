 fun main(){
     //массивы
     val arrayofingredients: Array<String> = arrayOf("dffsdf", "safsf", "wsdfds", "ddsfsd")
     val intarray1: IntArray = intArrayOf(2,2,2,2)
     val chararray: CharArray = charArrayOf('2','2','2')
     println("Size ${arrayofingredients.size}")
     println("index ${arrayofingredients.indexOf("dffsdf")}")
     println(arrayofingredients[2])
     arrayofingredients.set(1, "Davud")
     arrayofingredients.get(1)
     for(i in arrayofingredients){
         println(i)
     }
 }