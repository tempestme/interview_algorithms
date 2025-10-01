package hackerrank

/**
* Complete the 'countApplesAndOranges' function below.
*
* The function accepts following parameters:
*  1. INTEGER s
*  2. INTEGER t
*  3. INTEGER a
*  4. INTEGER b
*  5. INTEGER_ARRAY apples
*  6. INTEGER_ARRAY oranges
*/

/**
 * Solution for the HackerRank "Apple and Orange" problem.
 *
 * This function calculates and prints the number of apples and oranges that land on Sam's house.
 * The house is located on a segment of the x-axis from `s` to `t`.
 * The apple tree is at coordinate `a`, and the orange tree is at coordinate `b`.
 *
 * @param s The starting coordinate of Sam's house.
 * @param t The ending coordinate of Sam's house.
 * @param a The location of the apple tree.
 * @param b The location of the orange tree.
 * @param apples A list of distances the fallen apples travel.
 * @param oranges A list of distances the fallen oranges travel.
 */


fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var app = 0
    var orr = 0
    val house = s..t

    apples.forEach {
        if(it+a in house) {
            app++
        }
    }

    oranges.forEach {
        if(it+b in house) {
            orr++
        }
    }
    println(app)
    println(orr)
}

fun AppleAndOrange() {
    // Test Case 1: Basic Scenario
    println("--- Test Case 1 ---")
    countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
    println("Expected Output:")
    println("1")
    println("1")
    println()

    // Test Case 2: No Fruits Land on the House
    println("--- Test Case 2 ---")
    countApplesAndOranges(2, 5, 1, 6, arrayOf(10, 20), arrayOf(-10, -5))
    println("Expected Output:")
    println("0")
    println("0")
    println()

    // Test Case 3: Fruits Land on the Boundaries
    println("--- Test Case 3 ---")
    countApplesAndOranges(10, 12, 8, 13, arrayOf(2, 4, 0, 1), arrayOf(-1, -3))
    println("Expected Output:")
    println("2")
    println("2")
    println()

    // Test Case 4: Mixed Positive and Negative Distances
    println("--- Test Case 4 ---")
    countApplesAndOranges(7, 10, 4, 12, arrayOf(3, -1, 6), arrayOf(-2, -3, 0))
    println("Expected Output:")
    println("2")
    println("2")
    println()
}