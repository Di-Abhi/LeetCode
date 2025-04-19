class Solution {
    public long countAtMost(int[] nums,long comp){
        long ans=0;
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            while(i<n&&nums[i]+nums[n]>comp)n--;
            ans+=n-i;
        }
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countAtMost(nums,upper)-countAtMost(nums,lower-1);
    }
}