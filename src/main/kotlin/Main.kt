fun main() {

fibonacci()
    fibonacciAgain()
    naturalNumbers(5)
    checkEven(10)
    checkOdd(10)
    sumEven(5)
    getFactorial(5)
}
fun fibonacci (){
    var fibonacciSe = 15
   var fibo = IntArray(fibonacciSe)
    fibo[0] = 0
    fibo[1] = 1
    for (i in 2 until fibonacciSe){
        fibo[i] = fibo[i -1] + fibo[i - 2]
    }

for (i in 0 until fibonacciSe){
    print(fibo[i].toString() + " ")
}
}

fun fibonacciAgain(){
    val n = 20
    var t1 = 0
    var t2 = 1
    println("Fibonacci Series up to $n: ")

    for (i in 1..n){
        print("$t1 ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

//Write a Kotlin program to print the first n natural numbers using a for loop.
fun naturalNumbers(n1:Int) {
    for (x in 1..n1) {
        print(x)
    }
}
//Write a Kotlin program to print the first n even numbers using a for loop.
fun checkEven(n2:Int){
    for (x in 1..n2){
        if (x%2 == 0){
            println(x)
        }
    }
}
//Write a Kotlin program to print the first n odd numbers using a for loop.
fun checkOdd (n3:Int){
    for (x in 1..n3){
        if (x%2 != 0){
            println(x)
        }
    }
}
//Write a Kotlin program to print the sum of the first n natural numbers using a for loop.
fun sumEven(n4:Int){
    var n44 = 0
    for (x in 1..n4){
        n44 += x
    }
    println(n44)
}
//Write a Kotlin program to print the factorial of a number using a for loop.
fun getFactorial (n5:Int){
    var start = 1
    for (x in 1..n5){
        start *= x
    }
    println(start)
}
//Write a Kotlin program to check if a number is prime using a for loop.
//Write a Kotlin program to print the Fibonacci series up to a given number using a for loop.
//Write a Kotlin program to find the largest element in an array using a for loop.
//Write a Kotlin program to find the smallest element in an array using a for loop.
//Write a Kotlin program to find the sum of all the elements in an array using a for loop.
