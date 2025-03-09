class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0,r=0,jump=0;
        while(r<n-1){
            int far=0;
            for(int ind =l;ind<=r;ind++){
                far=Math.max(ind+nums[ind],far);
            }
            l=r+1;
            r=far;
            jump++;
        }
        return jump;
    }
}