fun main() {
    val fruitList = listOf("Apple", "Banana", "Orange", "Pear", "Watermelon")
    val maxLengthFruit = fruitList.maxBy { it.length }
    println("Max Length fruit is " + maxLengthFruit)
    val newList = fruitList.map { it.toUpperCase() }
    for (fruit in newList) {
        print(fruit + " ")
    }
    println("")
    val newList2 = fruitList.filter { it.length <= 5 } .map { it.toUpperCase() }
    for (fruit in newList2) {
        print(fruit + " ")
    }
    println("")
    val anyResult = fruitList.any { it.length <= 5 }
    val allResult = fruitList.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)
}