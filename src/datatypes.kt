fun main(args: Array<String>) {
    var my_string:String="eMobilis"
    var my_character:Char='G'
    var my_int:Int=6787
    var my_float:Float=54.54f
    var my_double:Double=36.787
    var my_bool:Boolean=true
    var my_array= arrayOf("banana","apples", 53,'r',false)


    println("I study at $my_string")
    println("My Character is $my_character")
    println("My integer is $my_int")
    println("My float is $my_float")
    println("My double is $my_double")
    println("My boolean is $my_bool")
    println("The values is my array are:")
    for (i in my_array)
        println(i)
}