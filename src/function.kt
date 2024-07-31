fun mayclass(){
    
    var name = "eMobilis"
    
    println("I learn coding at $name")
}
fun main(args: Array<String>) {
    
    mayclass()
    addtwonumbers()
    students("John","Doe",30)
    students("Jane","Shiku",20)
}

fun addtwonumbers(){

    var num1 = 7
    var num2 = 9

    println("The sum of $num1 and $num2 is ${num1+num2}")
}

fun students(fname:String, lname:String, age:Int){
    println("Student name is $fname $lname and is $age years old")

}