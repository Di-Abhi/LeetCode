class Solution {
    public int countPartitions(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            for(int j=i+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            System.out.println(leftSum-rightSum);
            if((Math.abs(leftSum-rightSum))%2==0){
                cnt++; 
            }
            rightSum=0;
        }
        return cnt;
    }
}