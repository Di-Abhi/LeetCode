class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0;
        int rsum=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
            max=lsum;
        }
        int ri=n-1;
        for(int i= k-1;i>=0;i--){
            lsum-=nums[i];
            rsum+=nums[ri];
            ri--;
            max=Math.max(max,lsum+rsum);
        }
        return max;
    }
}