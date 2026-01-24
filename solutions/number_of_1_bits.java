/**
 * Approach/Algorithm:
 * The solution counts the number of 1 bits in the binary representation of an integer.
 * It uses a bit manipulation trick where n & (n - 1) clears the least significant 1 bit in n.
 * This operation is repeated until n becomes 0, incrementing the count each time.
 *
 * Time Complexity: O(k) where k is the number of 1 bits in the integer
 * Space Complexity: O(1) as we only use a constant amount of extra space
 */
class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result++;
            n &= (n - 1); // Clear the least significant 1 bit
        }
        return result;
    }
}