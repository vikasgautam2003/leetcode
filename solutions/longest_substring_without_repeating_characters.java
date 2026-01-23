import java.util.*;

/**
 * Approach/Algorithm: Sliding Window with LinkedHashSet
 * - Uses a sliding window approach with a LinkedHashSet to track characters in the current window.
 * - The LinkedHashSet maintains insertion order and allows O(1) lookups.
 * - Expands the window by moving the right pointer and adds characters to the set.
 * - If a duplicate is found, removes characters from the left until the duplicate is removed.
 * - Tracks the maximum window size encountered.
 *
 * Time Complexity: O(n) - Each character is processed at most twice (once by right pointer, once by left pointer).
 * Space Complexity: O(min(m, n)) - Where m is the character set size (ASCII: 128, Unicode: more).
 *                   In worst case, stores all unique characters in the string.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int maxLen = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}