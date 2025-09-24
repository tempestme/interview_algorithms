package hackerrank

fun countResponseTimeRegressions(responseTimes: Array<Int>): Int {
    if (responseTimes.size < 2) {
        return 0
    }

    var regressions = 0
    var sum = responseTimes[0].toLong()

    for (i in 1 until responseTimes.size) {
        val currentElement = responseTimes[i]
        val previousAverage = sum.toDouble() / i

        if (currentElement > previousAverage) {
            regressions++
        }

        sum += currentElement
    }

    return regressions
}

fun main(args: Array<String>) {
    val responseTimesCount = readLine()!!.trim().toInt()

    val responseTimes = Array<Int>(responseTimesCount, { 0 })
    for (i in 0 until responseTimesCount) {
        val responseTimesItem = readLine()!!.trim().toInt()
        responseTimes[i] = responseTimesItem
    }

    val result = countResponseTimeRegressions(responseTimes)

    println(result)
}