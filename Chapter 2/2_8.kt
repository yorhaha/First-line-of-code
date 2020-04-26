fun printParams(num: Int, str: String = "hello") {
    println("num is $num, str is $str")
}

open class Person(val name: String = "", val age: Int = 0) {
}

class Student(val sno: String = "", val grade: Int = 0, name: String = "", age: Int = 0) :
    Person(name, age) {
}

fun main() {
    val brand = "Samsung"
    val price = 1299
    println("CellPhone(brand=$brand, prince=$price)")
    printParams(5)
    printParams(num = 66, str = "test")
}