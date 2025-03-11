class Solution {
    public int numSubarraysWithSumAtMostK(int[] nums, int goal) {
        int left=0;
        int sum=0;
        int count=0;
        int n=nums.length;
        for(int end=0;end<n;end++){
            sum+=nums[end];
            while(left<=end&&sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=end-left+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumAtMostK(nums,goal)-numSubarraysWithSumAtMostK(nums,goal-1);
    }
}