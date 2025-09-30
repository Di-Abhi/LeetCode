class Solution {
    private int[] helper(int[] ans,int n){
        for(int i=0;i<n-1;i++){
            ans[i]=(ans[i]+ans[i+1])%10;
        }
        return ans;
    }
    public int triangularSum(int[] nums) {
        int n= nums.length;
        while(n>0){
            helper(nums,n);
            n--;
        }
        return nums[0];
    }
}