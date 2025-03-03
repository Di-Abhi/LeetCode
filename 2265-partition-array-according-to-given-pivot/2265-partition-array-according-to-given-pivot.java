class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lCount=0;
        int gCount=0;
        int pCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lCount++;
            }else if(nums[i]>pivot){
                gCount++;
            }else{
                pCount++;
            }
        }
        int i=0;
        int j=lCount;
        int k = lCount+pCount;
        int ans[] = new int[nums.length];
        for(int num:nums){
            if(num<pivot){
                ans[i]=num;
                i++;
            }else if(num>pivot){
                ans[k]=num;
                k++;
            }else{
                ans[j]=num;
                j++;
            }
        }
        return ans;
    }
}