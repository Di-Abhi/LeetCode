class Solution {
    public int mirrorDistance(int n) {
        int ans=0;
        int rev = 0;
        int rem=0;
        for(int t=n;t>0;t/=10){
            rem=t%10;
            rev=rev*10+rem;
        }
        return Math.abs(rev-n);
    }
}