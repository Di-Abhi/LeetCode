class Solution {
    public int subsetXORSum(int[] nums) {
        int t=0;
        for(int num:nums){
            t|=num;
        }
        return t*(1<<(nums.length-1));
    }
}