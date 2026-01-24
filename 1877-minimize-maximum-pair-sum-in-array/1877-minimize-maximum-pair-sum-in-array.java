class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        if(nums.length==0)return 0;
        int n = nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
    }
}