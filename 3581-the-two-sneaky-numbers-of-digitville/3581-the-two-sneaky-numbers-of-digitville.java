class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int[] ans = new int[2];
        int k =0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                ans[k]=nums[i];
                k++;
            }
        }
        return ans;
    }
}