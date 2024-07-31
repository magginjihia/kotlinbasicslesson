class Fruits{
    var name=""
    var color=""
    var shape=""
    var price=0
}

fun main(args: Array<String>) {

    val myobj=Fruits()
    myobj.name="oranges"
    myobj.color="Yellow"
    myobj.shape="circle"
    myobj.price=20


    println("My favorite fruit is ${myobj.name} and it costs ${myobj.price} Kenya shillings")

    val obj2=Fruits()
    obj2.name="Apple"
    obj2.color="Green"
    obj2.shape="Round"
    obj2.price=35

    println("I've bought an ${obj2.name}, which is ${obj2.color} and ${obj2.shape} in color for ${obj2.price} Ksh.")

}