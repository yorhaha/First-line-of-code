fun main() {
    val fruitList = listOf("Apple", "Banana", "Orange", "Pear")
    for (fruit in fruitList) {
        print(fruit + " ")
    }
    println("")

    var maxLengthFruit = fruitList.maxBy { it.length }
    println("Max length fruit is " + maxLengthFruit)
    
    val fruitList2 = mutableListOf("Apple", "Banana", "Orange", "Pear")
    fruitList2.add("Watermelon")
    for (fruit in fruitList2) {
        print(fruit + " ")
    }
    println("")

    val fruitSet = setOf("Apple", "Banana", "Orange", "Pear")
    for (fruit in fruitSet) {
        print(fruit + " ")
    }
    println("")

    val fruitMap = HashMap<String, Int>()
    fruitMap["Apple"] = 1
    fruitMap["Banana"] = 2
    fruitMap["Orange"] = 3

    val fruitMap2 = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3)
    for ((fruit, number) in fruitMap2) {
        println("fruit of number " + number + " is " + fruit)
    }
}