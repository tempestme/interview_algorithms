package hackerrank

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

/**
 * You are in charge of the cake for a child's birthday. It will have one candle for each year of their total age.
 * They will only be able to blow out the tallest of the candles.
 * Your task is to count how many candles are the tallest.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest = 0
    val candleMap = hashMapOf<Int, Int>()

    candles.forEach {
        if(tallest<it) { tallest = it }

        if(candleMap.containsKey(it)) {
            val currentValue = candleMap.getOrDefault(it, 1)
            candleMap.put(it, currentValue+1)
        } else {
            candleMap.putIfAbsent(it, 1)
        }
    }

    return candleMap.getOrDefault(tallest, 0)
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}