class Solution {
    public int numberOfSubarraysAtMostK(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        for (int end = 0; end < n; end++) {
            sum += (nums[end]%2);
            while (left <= end && sum > k) {
                sum -= (nums[left]%2);
                left++;
            }
            count += end - left + 1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums,int k){
        return numberOfSubarraysAtMostK(nums,k)-numberOfSubarraysAtMostK(nums,k-1);
    }
}