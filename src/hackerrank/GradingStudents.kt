package hackerrank

/**
 * HackerLand University has the following grading policy:
 * Every student receives a grade in the inclusive range from 0 to 100.
 * Any grade less than 40 is a failing grade.
 *
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 * If the difference between the grade and the next multiple of 5 is less than 3,
 * round  up to the next multiple of 5.
 *
 * If the value of  is less than 38, no rounding occurs as the result will still be a failing grade.
 *
 * Sample Input 0
 * 4
 * 73
 * 67
 * 38
 * 33
 *
 * Sample Output 0
 * 75
 * 67
 * 40
 * 33
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val newGrades: MutableList<Int> = mutableListOf()

    grades.forEach {
        if(it%5<3 || it<38) {
            newGrades.add(it)
        } else {
            newGrades.add(it+(5-it%5))
        }
    }

    return newGrades.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}