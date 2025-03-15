class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n==1){
            return nums[0];
        }
        int prev2=0;
        int prev1=nums[0];
        int ans=0;
        for(int state=2;state<=n;state++){
            int pick=nums[state-1]+prev2;
            int noPick=0+prev1;
            ans=Math.max(pick,noPick);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}