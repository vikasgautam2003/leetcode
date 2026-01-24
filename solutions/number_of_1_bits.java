/**
 * Approach/Algorithm:
 * The solution counts the number of 1 bits in the binary representation of an integer.
 * It uses a bit manipulation trick where n & (n - 1) clears the least significant 1 bit in n.
 * This operation is repeated until n becomes 0, counting the number of operations performed.
 *
 * Time Complexity: O(k), where k is the number of 1 bits in the integer.
 * Space Complexity: O(1), as no additional space is used.
 */
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1); // Clears the least significant 1 bit
        }
        return count;
    }
}