package hackerrank

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {

    val countAInS = s.count { it == 'a' }

    val numFullRepetitions = n / s.length

    val totalAs = numFullRepetitions * countAInS

    val remainderLength = (n % s.length).toInt()
    val remainingString = s.substring(0, remainderLength)
    val countAInRemainder = remainingString.count { it == 'a' }

    return totalAs + countAInRemainder
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
