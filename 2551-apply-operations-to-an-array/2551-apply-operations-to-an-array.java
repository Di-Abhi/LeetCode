class Solution {
    public int[] applyOperations(int[] nums) {
        int nk=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1] && nums[i]!=0){
                nums[i]*=2;
                nums[i+1]=0;
            }
            if(nums[i]!=0){
                if(i!=nk){
                    int tmp = nums[i];
                    nums[i]=nums[nk];
                    nums[nk]=tmp;
                }
                nk++;
            }
        }
        return nums;
    }
}