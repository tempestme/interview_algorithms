package hackerrank

/*
 * Complete the 'minimumBribes' function below.
 *
 * The function accepts INTEGER_ARRAY q as parameter.
 */

/**
 * Solution for the HackerRank "New Year Chaos" problem.
 *
 * This file contains a function to determine the minimum number of bribes required
 * to achieve a given queue configuration. A bribe occurs when a person moves
 * forward in the queue.
 *
 * The solution correctly handles two key conditions:
 * 1.  **Too Chaotic Check:** It first verifies if any individual person has
 * bribed more than two other people. If this condition is met, the queue
 * is deemed "Too chaotic", and the function prints an error message and
 * terminates.
 * 2.  **Bribe Counting:** If the queue is not chaotic, the total number of bribes
 * is calculated. The most efficient way to count these bribes is to iterate
 * through the queue and for each person, count how many people with a smaller
 * original number are now in front of them. This is achieved by iterating
 * backwards from the end of the array to count the number of swaps.
 *
 * This implementation is designed to be both correct and performant by avoiding
 * inefficient nested loops for the bribe count where possible, and by
 * immediately exiting when a chaotic state is detected.
 *
 * @param q The array of integers representing the final queue configuration.
 */

fun minimumBribes(q: Array<Int>): Unit {
    var totalBribes = 0

    q.forEachIndexed { index, item ->
        if (item - (index + 1) > 2) {
            println("Too chaotic")
            return
        }
    }

    for (i in q.size - 1 downTo 0) {
        val originalPos = q[i]

        if (originalPos != i + 1) {
            for (j in i + 1 until q.size) {
                if (q[j] < originalPos) {
                    totalBribes++
                }
            }
        }
    }

    println(totalBribes)
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val q = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        minimumBribes(q)
    }
}