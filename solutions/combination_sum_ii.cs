        if (i > index && candidates[i] == candidates[i - 1]) continue;

        if (candidates[i] > target) break;

        res.add(candidates[i]);

        helper(candidates, target - candidates[i], arr, res, i + 1);

        res.remove(res.size() - 1);