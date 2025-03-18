class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, bitMask = 0, maxLen = 0;

        while (j < n) {
            while ((bitMask & nums[j]) != 0) {
                bitMask ^= nums[i]; 
                i++; 
            }

            bitMask |= nums[j]; 
            maxLen = Math.max(maxLen, j - i + 1); 
            j++; 
        }

        return maxLen;
    }
}
