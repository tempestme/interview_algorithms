
// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    val biggestValue = A.maxOrNull()?:1


    for(i in 1..biggestValue) {
        if(A.contains(i)) {
            continue
        } else {
            return i
        }
    }

    return if(biggestValue<0) {
        1
    } else {
        biggestValue+1
    }
}