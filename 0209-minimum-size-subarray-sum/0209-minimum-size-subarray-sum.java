class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0, min = Integer.MAX_VALUE;
        int i = 0;

        for (int j = 0; j < n; j++) {
            sum += nums[j];

            while (sum >= target) { 
                min = Math.min(min, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
