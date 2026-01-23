import java.util.*;

class Solution {
    /*
     * Approach/Algorithm: Sliding Window with LinkedHashSet
     * - Uses a LinkedHashSet to maintain the current window of characters without duplicates
     * - Expands the window by moving the right pointer and adding characters to the set
     * - If a duplicate is found, removes characters from the left until the duplicate is removed
     * - Tracks the maximum length of the window without duplicates
     *
     * Time Complexity: O(n) - Each character is processed at most twice (once by right, once by left)
     * Space Complexity: O(min(m, n)) - Where m is the character set size (ASCII: 128, Unicode: more)
     */
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int maxLen = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // If character already exists in the set, remove leftmost characters until duplicate is removed
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            // Update max length if current window is larger
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}