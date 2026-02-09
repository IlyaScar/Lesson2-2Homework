//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {



  //task2

val valueToCheck: String? = simulateElementSearch(0)

val textToCheck: String? = valueToCheck ?: "Элемент не найден"

println(" Searh result positive - $textToCheck")

    val valueToCheck2: String? = simulateElementSearch(-7)

    val textToCheck2: String? = valueToCheck2 ?: "Элемент не найден"

    println(" Searh result negative - $textToCheck2")




//task3
val serverResponse: Any = arrayOf("error",404)

// так как тип Эни то не могу взять элемент из массива
  val firstElement  = serverResponse.get(1)


  if (firstElement is Int ) {

      println("First element is number -  $firstElement" )
  }  else {

      print("Unknown error code")

      }
  }



/* val firstElement = serverResponse.getOrNull[1]

 val Test1: Int? = serverResponse[1] as? Int
 val result = safeCast ?: "Okay"
 println(result)*/








// task1
fun simulateElementSearch(searchid: Int): String? {

return if (searchid > 0) "Element is correct $searchid"
else null
}