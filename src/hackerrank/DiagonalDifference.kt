package hackerrank

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:
    1 2 3
    4 5 6
    9 8 9
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRight = 0
    var rightToLeft = 0

    var j = arr.size-1
    for(i in 0..arr.size-1) {
        leftToRight+=arr[i][i]
        rightToLeft+=arr[i][j]
        j--
    }

    if(rightToLeft>leftToRight) { return rightToLeft-leftToRight }
    return leftToRight - rightToLeft
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}