package hackerrank

/**
 * Solution for the HackerRank "Number Line Jumps" problem.
 *
 * This function determines if two kangaroos, starting at different positions
 * and jumping at different rates, will ever land on the same spot at the same time.
 *
 * The solution uses a mathematical approach instead of a brute-force simulation.
 * It models the kangaroos' positions over time as linear equations:
 * Kangaroo 1's position: `x1 + n * v1`
 * Kangaroo 2's position: `x2 + n * v2`
 *
 * By setting these equations equal to each other and solving for `n` (the number
 * of jumps), we can find if a meeting is possible. A valid meeting occurs only if
 * two conditions are met:
 * 1. The kangaroos' speeds are different (`v1 != v2`), preventing them from
 * maintaining a constant distance.
 * 2. The division `(x2 - x1) / (v1 - v2)` results in a whole number, indicating
 * that they meet after an integer number of jumps.
 *
 * This approach is highly efficient, with a constant time complexity, as it
 * avoids loops or recursion.
 *
 * @param x1 The starting position of the first kangaroo.
 * @param v1 The jump distance of the first kangaroo.
 * @param x2 The starting position of the second kangaroo.
 * @param v2 The jump distance of the second kangaroo.
 * @return "YES" if they can land on the same spot, otherwise "NO".
 */

/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if(v2>=v1) { return "NO" }

    var position1 = x1
    var position2 = x2

    while(position2>=position1) {
        if(position2==position1) {
            return "YES"
        } else {
            position1+=v1
            position2+=v2
            continue
        }
    }

    return "NO"
}