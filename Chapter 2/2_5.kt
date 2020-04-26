open class Person(val name: String, val age: Int) {
    fun eat() {
        println(name + " of age " + age + " is eating")
    }
}

interface Study {
    fun readBooks()
    fun doHomework() {
        println("Do homework in default implementation")
    }
}

class Student(var sno: String, val grade: Int, name: String, age: Int) : Person(name, age), Study {
    constructor() : this("", 0) {
    }

    constructor(name: String, age: Int) : this("", 0, name, age) {
    }

    init {
        if (sno == "") {
            sno = "NULL"
        }
        println("New student:")
        println("sno is " + sno)
        println("grade is " + grade)
    }

    override fun readBooks() {
        println(name + " is reading")
    }

    override fun doHomework() {
        println(name + " is doing homework")
    }
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}

data class Cellphone(val brand: String, val price: Double)

object Singleton {
    fun singletonTest() {
        println("Singleton test is called")
    }
}

fun main() {
    val stu = Student("a123", 5, "Jack", 19)
    val stu1= Student()
    val stu2 = Student("Tom", 18)
    stu.readBooks()
    stu.doHomework()
    doStudy(stu2)

    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("Two cellphones are equal : " + (cellphone1 == cellphone2))

    Singleton.singletonTest()
}
