package hackerrank

//Sample Input
//
//8
//UDDDUDUU
//Sample Output
//
//1
//Explanation
//
//If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:
//
//_/\      _
//\    /
//\/\/
//The hiker enters and leaves one valley.

fun countingValleys(steps: Int, path: String): Int {
    var valleys = 0
    var level = 0

    for (step in path) {
        if(step == 'D' && level == 0) {
            valleys++
        }

        if(step == 'U') {
            level++
        } else {
            level--
        }
    }

    return valleys
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}