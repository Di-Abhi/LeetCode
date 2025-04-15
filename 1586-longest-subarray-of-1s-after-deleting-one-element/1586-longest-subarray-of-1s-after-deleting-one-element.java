class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0;
        int left=0;
        int maxlen=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0) zero++;
            while(zero>1){
                if(nums[left++]==0) zero--;
            }
            maxlen=Math.max(maxlen,end-left);
        }
        return maxlen;
    }
}