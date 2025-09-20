package hackerrank

fun main(){
    println(
        sockMerchant(4 , arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
    )
}

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val unpaired = HashSet<Int>()
    var paired = 0

    for(sock in ar) {
        if(unpaired.contains(sock)) {
            paired++
            unpaired.remove(sock)
        } else {
            unpaired.add(sock)
        }
    }
    return paired
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}