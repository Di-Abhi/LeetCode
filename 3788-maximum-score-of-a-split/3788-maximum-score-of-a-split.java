class Solution {
    public long maximumScore(int[] nums) {
        long[] prefixsum= new long[nums.length];
        int[] suffixmin=new int[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixsum[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            suffixmin[i]=min;
            min=Math.min(min,nums[i]);
        }
        long ans = Long.MIN_VALUE;
        long res=0;
        for(int i=0;i<nums.length;i++){
            res=prefixsum[i]-suffixmin[i];
            if(res>ans){
                ans=res;
            }
        }
        return ans;
    }
}