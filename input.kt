import java.util.Scanner

fun main(args:Array<String>){
    val reader = Scanner(System.`in`)

    print("Enter two numbers: ")

    var num1:Int=reader.nextInt()
    var num2:Int=reader.nextInt()

    var summ = num1 + num2

    var total = if (num1>num2){
        println("the largest is num1: $num1")
    }else{
        println("the largest is num2: $num2")
    }

    println("The sum of the numbers are: $summ")

}