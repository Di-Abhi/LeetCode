class Solution {
    // Checks if we can make the array all zeros using the first 'mid' queries
    public boolean canMakeZero(int[] nums, int[][] queries, int mid) {
        int n = nums.length;
        int[] diff = new int[n + 1]; // Difference array for range updates

        for (int i = 0; i < mid; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int t = queries[i][2];

            diff[l] -= t;         // Start decrement at index l
            if (r + 1 < n) {
                diff[r + 1] += t; // Stop decrement after index r
            }
        }

        int[] updated = nums.clone();
        int currentChange = 0;

        for (int i = 0; i < n; i++) {
            currentChange += diff[i];
            updated[i] += currentChange;
            if (updated[i] < 0) updated[i] = 0; // Values can't go below 0
        }

        // Check if the array is all zeros
        for (int num : updated) {
            if (num != 0) return false;
        }
        return true;
    }

    // Returns the minimum number of operations needed to make the entire array zero
    public int minZeroArray(int[] nums, int[][] queries) {
        int m = queries.length;
        if (isAllZeros(nums)) return 0;

        int left = 1, right = m, answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMakeZero(nums, queries, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    // Helper function to check if the array is already all zeros
    private boolean isAllZeros(int[] nums) {
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
