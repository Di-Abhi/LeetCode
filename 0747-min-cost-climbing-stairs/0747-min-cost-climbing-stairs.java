class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int prev1=0;
        int prev2=0;
        int ans=0;
        for(int i=2;i<=n;i++){
            int oneStep=cost[i-1]+prev1;
            int twoStep = cost[i-2]+prev2;
            ans=Math.min(oneStep,twoStep);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}