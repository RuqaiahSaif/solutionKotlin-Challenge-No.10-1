class Singleton1 {

object Singleton{
    init {
        println("singleton class invoked")
    }
var name="kotlin objects"
    fun printName(){
        println(name)

    }
}

class A{
    init {
        println("class init method. singleton init propetry "+Singleton.name)
        Singleton.printName()
    }

}

}
fun main() {
    Singleton1.Singleton.printName()
    Singleton1.Singleton.name="kk"
    var a= Singleton1.A()
}
