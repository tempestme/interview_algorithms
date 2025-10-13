package hackerrank


/**
 * Solution for the HackerRank "Breaking the Records" problem.
 *
 * This function calculates the number of times Maria breaks her
 * records for both the most points and the least points in a season.
 *
 * The solution iterates through a list of scores, keeping track of the
 * current highest and lowest scores seen so far. For each new score,
 * it compares the score against these current records.
 *
 * If a new score is strictly greater than the current highest score,
 * the highest score record is updated, and a counter for breaking the
 * "most points" record is incremented.
 *
 * Similarly, if a new score is strictly less than the current lowest score,
 * the lowest score record is updated, and a counter for breaking the
 * "least points" record is incremented.
 *
 * The initial records are set to the very first score in the list to
 * ensure a correct starting point for comparisons.
 *
 * @param scores An array of integers representing the scores in chronological order.
 * @return An array of two integers: the number of times the highest record was broken,
 * and the number of times the lowest record was broken.
 */

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var bestScore = scores.first()
    var worstScore = scores.first()
    var numberOfBest = 0
    var numberOfWorst = 0

    scores.forEach {
        if(it>bestScore) {
            bestScore = it
            numberOfBest++
        }
        if(it<worstScore) {
            worstScore = it
            numberOfWorst++
        }
    }
    return listOf(numberOfBest, numberOfWorst).toTypedArray()
}