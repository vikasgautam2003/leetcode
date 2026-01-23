import java.util.Hashtable

/**
 * Approach/Algorithm: Hash Table (Two-pass)
 * - First pass: Store each number's value and its index in a hash table
 * - Second pass: For each number, check if its complement (target - num) exists in the hash table
 * Time Complexity: O(n) - We traverse the list twice, each traversal is O(n)
 * Space Complexity: O(n) - We store all elements in the hash table
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];