class Solution {
    public int cntDigit(int n){
        int cnt=0;
        while(n>0){
            n/=10;
            cnt++;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cntDigit(nums[i])%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}