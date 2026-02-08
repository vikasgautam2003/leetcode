        int ans = candidates[index];
        res.add(ans);
        helper(candidates, target, arr, res, index + 1, sum + ans);

        res.remove(res.size() - 1);

        helper(candidates, target, arr, res, index + 1, sum);