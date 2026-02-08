    void helper(int[] candidates, int target, List<List<Integer>> arr,  List<Integer> res, int index, int sum)
    {
        if(sum == target)
        {
            arr.add(new ArrayList<>(res));
            return;
        }

        int ans = candidates[index];