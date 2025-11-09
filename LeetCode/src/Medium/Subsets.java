package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Level : Medium
 * Title : 78. Subsets
 * Topic : Array, Backtracking, Bit Manipulation
 *
 * Started : 2025-11-09
 * Solved : 2025-11-09
 * Time: 17 min 32 sec
 * Algorithm: DFS 사용 - re
 *
 *
 *
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int start, int[] nums, List<Integer> path, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path));
        for(int i = start; i < nums.length; ++i) {
            path.add(nums[i]);
            dfs(i + 1, nums, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
