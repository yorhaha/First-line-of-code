object Util1 {
    fun doAction() {
        println("do action")
    }
}

class Util2 {
    fun doAction1() {
        println("do action1")
    }
    
    companion object {
        fun doAction2() {
            println("do action2")
        }
    }
}

class Util3 {
    fun doAction1() {
        println("do action1")
    }
    
    companion object {
        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}

fun main() {
    Util1.doAction()
    Util2.doAction2()
    Util3.doAction2()
}