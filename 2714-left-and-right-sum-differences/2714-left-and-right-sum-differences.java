class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum1=0;
        int sum2=0;
        int n=nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int j=n-1;
        for(int i=0;i<n;i++){
            leftSum[i]=sum1;
            sum1+=nums[i];
            rightSum[j]=sum2;
            sum2+=nums[j];
            j--;
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
        
    }
}