class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int r = sum - k;
            cnt += mpp.getOrDefault(r, 0);
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}