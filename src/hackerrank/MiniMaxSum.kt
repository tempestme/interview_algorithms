package hackerrank

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing
 * exactly four of the five integers. Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.
 */

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var arraySum: Long = 0L
    arr.forEach {
        arraySum+=it.toLong()
    }

    var minSum: Long = 0L
    var maxSum: Long = 0L

    arr.forEach {
        if(arraySum-it<minSum || minSum == 0L) {
            minSum = arraySum-it.toLong()
        }

        if(arraySum-it>maxSum) {
            maxSum = arraySum-it
        }
    }

    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}