class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap max and min because multiplying by a negative flips them
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Calculate the max and min product ending at this position
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // Update the result with the largest product found so far
            result = Math.max(result, maxProd);
        }

        return result;
    }
}
