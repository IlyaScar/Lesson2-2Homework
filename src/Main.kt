/**
* Надо сразу привыкать к нормальному форматированию кода, лишние пустые строки не нужны, ли шние отстпы тоже
*/

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
  val serverResponse: Any = arrayOf("error","sdfs")
  // так как тип Эни то не могу взять элемент из массива
  /** И чего с этим будем делать? Не работает же код*/
  if (serverResponse is Array<*>) {
    val typeCheck = serverResponse.get(1) as? Int
    if (typeCheck is Int) {
      println("Error Code -  $typeCheck")
    } else {
      println("UnknownError")
    }
  }
  }
/** Что ниже за закоментированный код? Если не нужен, удаляй */
// удалил код
// task1
fun simulateElementSearch(searchid: Int): String? {
/** Форматирование if может быть двух видов, либо все в одну строку, если умещается в договоренности (обычто 120 ил 150 символов)
* либо каждый блок в фигурных скобках
* return if (searchid > 0) {
*  "Element is correct $searchid"
*} else {
*  null
*}
*  
* return if (searchid > 0) "Element is correct $searchid" else null
*/
// написал в одну строку
return if (searchid > 0) "Element is correct $searchid" else null
}
