package hackerrank

/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

/**
 * In this challenge, you need to calculate and print the sum of elements in an array,
 * considering that some integers may be very large.
 */

fun aVeryBigSum(ar: Array<Long>): Long {
    var result: Long = 0

    ar.forEach {
        result+=it
    }

    return result
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}