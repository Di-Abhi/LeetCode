class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int left=0;
        long cnt=0;
        int ans=0;
        for(int end=0;end<n;end++){
            if(nums[end]==max){
                ans++;
            }
            while(ans==k){
                cnt+=n-end;
                if(nums[left]==max)ans--;
                left++;
            }
        }
        return cnt;
    }
}