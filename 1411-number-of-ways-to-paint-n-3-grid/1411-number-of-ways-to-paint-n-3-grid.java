class Solution {
    public int numOfWays(int n) {
        int mod =(int) 1e9+7;
        long a = 6;
        long b = 6;
        for(int i=2;i<=n;i++){
            long newa = ((a*2)+(b*2))%mod;
            long newb = ((a*2)+(b*3))%mod;
            a=newa;
            b=newb;
        }
        return (int)(a+b)%mod;
    }
}