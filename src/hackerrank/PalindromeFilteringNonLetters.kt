package hackerrank

/**
 * Solution for the HackerRank "Valid Palindrome" or similar challenge.
 *
 * This function checks if a given string is a palindrome after filtering out
 * all non-alphabetic characters. A palindrome is a sequence that reads the same
 * forwards and backwards.
 *
 * The approach first cleans the input string by keeping only letters and
 * converting them to a consistent case (e.g., lowercase). It then uses a
 * two-pointer technique to efficiently compare characters from both ends of
 * the filtered string. The pointers move inwards, and if a mismatch is found
 * at any point, the function immediately returns false. If the pointers meet
 * or cross without finding any mismatches, the string is a valid palindrome.
 *
 * This solution is optimal as it avoids creating a reversed copy of the string
 * and checks for the palindrome condition in a single pass.
 *
 * @param code The input string to be checked.
 * @return `true` if the filtered string is a palindrome, `false` otherwise.
 */

fun isAlphabeticPalindrome(code: String): Boolean {
    val onlyLetters = code.filter { it.isLetter() }.lowercase()

    if(onlyLetters.length==1) return true

    var backwards = onlyLetters.length-1
    for(forward in 0..onlyLetters.length-1) {
        if(onlyLetters[forward] != onlyLetters[backwards]) {
            return false
        }
        backwards--
    }
    return true
}