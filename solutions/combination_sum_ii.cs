class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int size = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(candidates, target, arr, res, 0);

        return arr;
    }