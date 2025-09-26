package hackerrank

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

/**
 * Given an array of integers, calculate the ratios of its elements.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements: two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
 */

fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0
    var negative = 0
    var zero = 0

    arr.forEach { value ->
        if(value>0) { positive++ }
        if(value<0) { negative++ }
        if(value==0) { zero++ }
    }
    println(positive/arr.size.toDouble())
    println(negative/arr.size.toDouble())
    println(zero/arr.size.toDouble())
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}