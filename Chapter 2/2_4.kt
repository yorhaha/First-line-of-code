fun getIfScore(name: String) = if (name == "Tom") {
    10
} else if (name == "Jim") {
    20
} else {
    30
}

fun getWhenScore(name: String) = when {
    name.startsWith("Tom") -> 20
    name == "Jim" -> 30
    name == "Jack" -> 40
    else -> 50
}

fun getWhenScore2(name: String) = when (name) {
    "Tom" -> 20
    "Jim" -> 30
    "Jack" -> 40
    else -> 50
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("Number is a Int")
        // Why cannot : println(num + " is a Int")
        is Double -> println("Number is a Double")
        else -> println("Number is not allowed")
    }
}

fun main() {
    println("The score of Tom is " + getIfScore("Tom"))
    println("The score of Tommy is " + getWhenScore("Tommy"))
    println("The score of Mary is " + getWhenScore2("Mary"))
    checkNumber(5.0)
    checkNumber(10L)
    println("0..10 = ")
    for (i in 0..10) {
        print(i)
        print(", ")
    }
    println("\n0 until 10 = ")
    for (i in 0 until 10) {
        print(i)
        print(", ")
    }
    println("\n0 until 10 step 2 = ")
    for (i in 0 until 10 step 2) {
        print(i)
        print(", ")
    }
    println("\n10 downTo 0 = ")
    for (i in 10 downTo 0) {
        print(i)
        print(", ")
    }
}