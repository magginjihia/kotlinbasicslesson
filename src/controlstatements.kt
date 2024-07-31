fun main(args: Array<String>) {
    var age = 21

    if(age>=18){

        println("You are eligible to vote")

    }
    else{

        println("Sorry, you can't vote")
    }

    var num = 3

    if (num%2==0) {

        println("$num is an even number")
    }
    else{

        println("$num is an odd number")
    }

    var marks=20

    if(marks>=80 && marks<=100){

        println("You scored an A")
    }
    else if (marks>=60 && marks<=79){

        println("You scored a B")
    }

    else if (marks>=40 && marks<=59){

        println("You scored a C")
    }

    else if (marks>=0 && marks<=49){

        println("You failed")
    }

    else{

        println("Wrong Input")
    }
}