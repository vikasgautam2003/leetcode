/**
 * Approach/Algorithm: Bit Manipulation
 * This solution counts the number of 1 bits in the binary representation of a number.
 * It uses a bitwise operation to check each bit one by one.
 * Time Complexity: O(1) - The loop runs a fixed number of times (32 for 32-bit integers)
 * Space Complexity: O(1) - Uses constant extra space
 */
var hammingWeight = function(n) {
    let count = 0;

    while (n !== 0) {
        // Check if the least significant bit is 1
        count += n & 1;
        // Right shift to check the next bit
        n = n >>> 1;
    }

    return count;
};