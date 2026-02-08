class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int size = candidates.length;
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(candidates, target, arr, res, 0, 0);
    }

    void helper(int[] candidates, int target, List<List<Integer>> arr,  List<Integer> res, int index, int sum)
…
        res.remove(size() - 1);

        helper(candidates, target, arr, res, index + 1, sum);

    }
}