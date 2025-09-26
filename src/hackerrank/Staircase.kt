package hackerrank

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

/**
 * Staircase detail
This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces.
The last line is not preceded by any spaces.
 */

fun staircase(n: Int): Unit {
    var spaces = n-1
    val symbol = "#"
    val space = " "
    for(i in 1..n) {
        println("${space.repeat(spaces)}${symbol.repeat(i)}")
        spaces--
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}