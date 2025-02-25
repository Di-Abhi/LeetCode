class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd=0,even=1;
        int prefix =0,cnt=0;
        int MOD = 1000000007;
        for(int num:arr){
            prefix+=num;

            if(prefix%2==0){
                cnt=(cnt+odd)%MOD;
                even++;
            }else{
                cnt=(cnt+even)%MOD;
                odd++;
            }
        }
        return cnt;
    }
}