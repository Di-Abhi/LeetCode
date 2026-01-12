class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }
}