import java.util.*;

class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void solve(int[] nums, int ind, List<List<Integer>> res) {
        int n = nums.length;
        if (ind == n) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            res.add(perm);
            return;
        }
        for (int i = ind; i < n; i++) {
            swap(nums, i, ind);  
            solve(nums, ind + 1, res);  
            swap(nums, i, ind);  
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, res);
        return res;
    }
}
