class Solution {
    public int minimumCost(int[] nums) {
        int cost = nums[0];
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i=1;i<nums.length;i++){
            int curr =nums[i];
            if(min1>curr){
                min2=min1;
                min1=curr;
            }else if(min2>curr){
                min2=curr;
            }
        }
        return cost+min1+min2;
    }
}