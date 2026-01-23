import java.util.Hashtable;

/**
 * Approach/Algorithm: Uses a hash table to store each number's value and its index.
 * For each number, calculates the complement (target - current number) and checks if it exists in the hash table.
 * If found, returns the indices of the complement and current number.
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(n) - Stores up to n elements in the hash table
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];