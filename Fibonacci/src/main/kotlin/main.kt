/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT2 - Practical, Activity 1
    Fibonacci Number
*/

fun main(args: Array<String>) {
    var a: Int = 0;
    var b: Int = 1;
    var c: Int = 0;

    print("Enter a number: ")
    val Input: Int = readln().toInt()

    print("$a, $b, ")
    while (Input >= c) {
        c = a + b;
        a = b;
        b = c;
        if (Input >= c) {
            print("$c")
            if (Input >= a + b)
                print(", ")
        } else
            break
    }
    println()
}




