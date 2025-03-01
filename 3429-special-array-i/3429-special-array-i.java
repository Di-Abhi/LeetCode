class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int n1=nums[i]%2;
            int n2=nums[i+1]%2;
            if(n1==n2){
                return false;
            }
        }
        return true;
    }
}