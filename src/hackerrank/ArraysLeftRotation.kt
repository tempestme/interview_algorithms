package hackerrank

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

/**
 * Solution for the HackerRank "Arrays: Left Rotation" problem.
 *
 * This file contains a function to perform a left rotation on an array of integers.
 * A left rotation shifts each element `d` positions to the left. Elements that
 * are shifted off the front of the array are reinserted at the end.
 *
 * The `rotLeft` function implements this rotation by creating a new array and
 * calculating the new position for each element from the original array.
 * The formula `(index - effectiveRotations + n) % n` is used to find the
 * new index, handling both negative results and rotations larger than the array size.
 *
 * The solution is optimal in terms of space complexity for languages like Kotlin that
 * do not support simple, efficient in-place array manipulation for this task.
 *
 * @param a The original array of integers to be rotated.
 * @param d The number of positions to rotate to the left.
 * @return A new array containing the left-rotated elements.
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val n = a.size
    val effectiveRotations = d % n
    val newArray = Array(n) { 0 }

    a.forEachIndexed { index, item ->
        val newIndex = (index - effectiveRotations + n) % n
        newArray[newIndex] = item
    }

    return newArray
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}