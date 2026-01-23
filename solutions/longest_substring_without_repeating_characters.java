import java.util.*;

class Solution {
    /**
     * Approach: Sliding Window with LinkedHashSet
     * - Uses a LinkedHashSet to maintain characters in the current window
     * - Expands the window by moving the right pointer
     * - Shrinks the window from the left when a duplicate is found
     * - Tracks the maximum length of the window without duplicates
     *
     * Time Complexity: O(n) - Each character is processed at most twice (once by right, once by left)
     * Space Complexity: O(min(m, n)) - Where m is the character set size (stores at most m characters)
     */
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