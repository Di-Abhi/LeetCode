class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int prev2=1;
        int prev1=2;
        int ans=0;
        for(int state=3;state<=n;state++){
            ans=prev2+prev1;
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}