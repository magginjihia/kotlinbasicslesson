//open means that's the parent class
open class parent{
    var dad="Like watching football"
    var mum="Like going shopping"
}

class daughter:parent(){

    fun da(){
        println("mum $mum")
    }

}

class son:parent(){

    fun so(){

        println("Dad $dad")
    }

}

fun main(args: Array<String>) {
    val obj=daughter()
    obj.da()

    val obj2=son()
    obj2.so()
}