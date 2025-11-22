class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        if(nums.length==0) return 0;

        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]- nums[0];
    }
}