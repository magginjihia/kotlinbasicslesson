fun main(args: Array<String>) {

    //for loop

    var myarray = arrayOf("Toyota", "Mazda",'t',56 ,"Mercedes")

    for (i in myarray){

        println( "$i")
    }

    //range

    for (x in 5..15){

        println("Range is "+x)
    }

    for (i in 'd' .. 'k'){

        println("Range is "+i)
    }

   // do while

    var num = 100
    do {
        println(+num)
        num++
    }
        while (num<=105)
}