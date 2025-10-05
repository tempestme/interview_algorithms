package hackerrank

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

/**
 * Solution for the HackerRank "2D Array - DS" problem.
 *
 * This function finds the maximum hourglass sum within a 6x6 2D array.
 * An hourglass is a 3x3 shape with a specific pattern of 7 elements.
 *
 * The solution iterates through the array, treating each cell as the potential
 * top-left corner of an hourglass. For each potential hourglass, it calculates
 * the sum of its elements. The function then keeps track of and returns the
 * largest sum found.
 *
 * The iteration loops are constrained to prevent an IndexOutOfBoundsException
 * by ensuring there is always a full 3x3 grid to check.
 *
 * @param arr The 6x6 2D array of integers.
 * @return The maximum possible hourglass sum.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxSum = countHourglass(0, 0, arr)
    for(horizontal in 0..3) {
        for(vertical in 0..3) {
            val hourglassSum = countHourglass(horizontal, vertical, arr)
            if(maxSum<hourglassSum) { maxSum = hourglassSum }
        }
    }
    return maxSum
}

fun countHourglass(horizontal: Int, vertical: Int, arr: Array<Array<Int>>): Int {
    var result = 0
    result += arr[horizontal][vertical]
    result += arr[horizontal][vertical+1]
    result += arr[horizontal][vertical+2]

    result += arr[horizontal+1][vertical+1]

    result += arr[horizontal+2][vertical]
    result += arr[horizontal+2][vertical+1]
    result += arr[horizontal+2][vertical+2]

    return result
}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}