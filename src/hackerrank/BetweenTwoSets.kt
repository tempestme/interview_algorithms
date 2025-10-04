package hackerrank

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */



/**
 * Solution for the HackerRank "Between Two Sets" problem.
 *
 * This function finds the number of integers that are "between two sets". An integer `x` is
 * considered to be between two sets, `a` and `b`, if the following two conditions are met:
 *
 * 1. Every element in `a` is a factor of `x`.
 * 2. `x` is a factor of every element in `b`.
 *
 * The solution iterates through all possible integers in a constrained range. The lower bound
 * of this range is the maximum value in set `a`, because any valid integer must be a multiple
 * of all elements in `a`. The upper bound is the minimum value in set `b`, because any valid
 * integer must be a factor of all elements in `b`.
 *
 * For each integer in this range, the function uses the `all` collection function to efficiently
 * check if it satisfies both conditions. The count of all such valid integers is returned.
 *
 * @param a An array of integers representing the first set.
 * @param b An array of integers representing the second set.
 * @return The total number of integers that are between the two sets.
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var count = 0
    val aMax = a.maxOrNull()?:0
    val bMin = b.minOrNull()?:0

    for (x in aMax..bMin) {
        val isFactorOfA = a.all { x % it == 0 }
        val isFactorOfB = b.all { it % x == 0 }

        if (isFactorOfA && isFactorOfB) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}