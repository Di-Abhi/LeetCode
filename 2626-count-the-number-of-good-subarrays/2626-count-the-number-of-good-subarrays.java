class Solution {
    public long countGood(int[] nums, int k) {
        long ans=0;
        int n=nums.length;
        int left=0;
        int pairs=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int end=0;end<n;end++){
            int val=nums[end];
            pairs+=mpp.getOrDefault(val,0);
            mpp.put(val,mpp.getOrDefault(val,0)+1);
            while(pairs>=k){
                ans+=n-end;
                int out=nums[left++];
                mpp.put(out,mpp.get(out)-1);
                pairs-=mpp.get(out);
            }
        }
        return ans;
    }
}