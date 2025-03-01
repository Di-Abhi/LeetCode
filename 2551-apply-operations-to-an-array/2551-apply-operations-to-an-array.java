class Solution {
    public void moveZeros(int[] nums){
        int j=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;

        for(int i = j+1;i<n;i++){
            if(nums[i]!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                j++;
            }
        }
    }
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i =0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        moveZeros(nums);
        return nums;
    }
}