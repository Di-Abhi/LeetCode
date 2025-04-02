class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;

        int[] maxSuffix = new int[n];
        maxSuffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxSuffix[i] = Math.max(nums[i], maxSuffix[i + 1]);
        }

        int maxPrefix = nums[0];
        for (int j = 1; j < n - 1; j++) {
            if (maxPrefix > nums[j]) { 
                long value = (long) (maxPrefix - nums[j]) * maxSuffix[j + 1];
                maxVal = Math.max(maxVal, value);
            }
            maxPrefix = Math.max(maxPrefix, nums[j]);
        }

        return maxVal;
    }
}
