package leetcode

/***
 * 217. Contains Duplicate
 * Easy
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

 fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        nums.forEach { if (!seen.add(it)) return true }
        return false
    }
