    {
        if(sum == target)
        {
            arr.add(res);
            return;
        }

        res.add(candidates[index]);
        helper(candidates, target, arr, res, index + 1, si);