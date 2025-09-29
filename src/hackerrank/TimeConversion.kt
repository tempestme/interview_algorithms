package hackerrank

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Sample Input 0
 * 07:05:45PM
 *
 * Sample Output 0
 * 19:05:45
 */

fun timeConversion(s: String): String {
    val timeParts = s.substring(0, s.length - 2).split(":")
    var hours = timeParts[0].toInt()
    val minutes = timeParts[1]
    val seconds = timeParts[2]
    val ampm = s.substring(s.length - 2)

    when (ampm) {
        "PM" -> {
            if (hours != 12) {
                hours += 12
            }
        }
        "AM" -> {
            if (hours == 12) {
                hours = 0
            }
        }
    }

    val formattedHours = String.format("%02d", hours)

    return "$formattedHours:$minutes:$seconds"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}