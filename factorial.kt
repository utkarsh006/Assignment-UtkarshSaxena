import java.util.Scanner

class FactorialCalculator{
    companion object{
        fun calculateFactorial(n: Int) : Long{
            //base case, since factorial of 0 and 1 is 1
            return if(n==0|| n==1) {
                1
            } else{
                //convert the number to long(for returnType), and calculate factorial
                n.toLong() * calculateFactorial(n-1)
            }
        }
    }

}

fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter the number : ")
    val num = scanner.nextInt()

    val answer = FactorialCalculator.calculateFactorial(num)
    println("Factorial of $num is $answer")
}

/*
Requirements : 

- Kotlin class named FactorialCalculator.
- public static long calculateFactorial(int n)
- returns the factorial of n as a long.
- n will always be a non-negative integer.
- Test your program with various values of n to verify its correctness.

*/
