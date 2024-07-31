
class wanafunzi(var fname:String,var course_taken:String, var phoneno:Int){
//constructor is empty inside
}

fun main(args: Array<String>) {
    val stud=wanafunzi("Maggie", "MIT", 721123456)
    println(stud.fname)
    println(stud.course_taken)
    println(stud.phoneno)
}