class Singleton3 {
    class A{
        init {
            println("class init method.")
        }
        object SingletonA{
            init {
                println("singletonA class invoked")
            }
            var name="kotlin objects A"
            fun printName(){
                println(name)

            }
        }
        companion object SingletonB{init {
            println("singletonB class invoked")
        }
            var name="kotlin objects B"
            fun printName(){
                println(name)

            }

        }

    }
}

fun main() {
    var a=Singleton3.A()
    var b=Singleton3.A.name
    Singleton3.A.name="kotlin tutorial"
    Singleton3.A.printName()


}