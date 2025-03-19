class Solution {
    public int minOperations(int[] nums) {
     int n=nums.length;
     int cnt=0;
     int i=2;
     while(i<n){
        if(nums[i-2]==0){
            nums[i-2]=nums[i-2]==0?1:0;
            nums[i-1]=nums[i-1]==0?1:0;
            nums[i]=nums[i]==0?1:0;
            cnt++;
        }
        i++;
     }   
     for(int num:nums){
        if(num==0) return -1;
     }
     return cnt;
    }
}