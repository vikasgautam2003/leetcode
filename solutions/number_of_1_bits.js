/**
 * Approach/Algorithm: The solution counts the number of 1 bits in the binary representation of a number.
 * It does this by repeatedly checking the least significant bit (using n & 1) and right-shifting the number.
 * Time Complexity: O(1) - The loop runs a maximum of 32 times (for 32-bit integers)
 * Space Complexity: O(1) - Uses constant extra space
 */
var hammingWeight = function(n) {
    let count = 0;
    while (n !== 0) {
        count += n & 1; // Check if the least significant bit is 1
        n = n >>> 1;    // Right shift to check the next bit
    }
    return count;
};