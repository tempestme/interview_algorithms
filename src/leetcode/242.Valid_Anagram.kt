package leetcode

import java.util.logging.Logger

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */


/**
 * this solution is really good in using memory but not as fast as hashMap solution
 */
fun isAnagram(s: String, t: String): Boolean {
    if (s.length!=t.length) return false
    val range = t.toMutableList()

    s.forEach { letter ->
        val index = range.indexOf(letter)
        if(index >= 0) {
            range.removeAt(index)
        } else {
            return false
        }
    }
    if(range.size==0) return true
    return false
}

/***
 * this is fast but need a lot of memory in comparison to mutableArrayList solution
 */
fun isAnagram2(s: String, t: String): Boolean {
    val map = HashMap<Char, Int>()

    s.forEach {
        map[it] = map.getOrDefault(it,0) +1
    }

    t.forEach {
        map[it] = map.getOrDefault(it,0) -1
    }

    map.keys.forEach {
        if(map[it] != 0) return false
    }
    return true
}
