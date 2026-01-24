/**
 * Approach/Algorithm:
 * The solution counts the number of 1 bits in the binary representation of an integer.
 * It uses a loop to check each bit of the number until the number becomes zero.
 * Time Complexity: O(1) - The loop runs a maximum of 32 times (for 32-bit integers)
 * Space Complexity: O(1) - Uses a constant amount of extra space
 */
class Solution {
    public int hammingWeight(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        int var = n;

        while (var != 0) {

        }