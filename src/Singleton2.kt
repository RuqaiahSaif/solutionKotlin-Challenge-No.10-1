class Singleton2 {
    class A(){
       init {
           println("class init method. singleton init propetry")
       }
        object Singleton{
            init {
                println("singleton class invoked")
            }
            var name="kotlin objects"
            fun printName(){
                println(name)

            }
        }
    }
}

fun main() {
    var a=Singleton2.A()
}