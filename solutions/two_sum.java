import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i = 0; i < nums.length; i++)
        {
            int comp  = target - nums[i];