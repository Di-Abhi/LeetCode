class Solution {
    public boolean poss(int[] candies,long k,int mid){
        long cnt=0;
        for(long num:candies){
            cnt += num/mid;
            if(cnt>=k){
                return true;
            }
        }
        return false;

    }
    public int maximumCandies(int[] candies, long k) {
        int n =candies.length;
        int left = 1;
        int right=Integer.MIN_VALUE;
        for(int num : candies){
            right=Math.max(right,num);
        }
        int ans=0;
        while(left<=right){
            int mid = (left+right)/2;
            if(poss(candies,k,mid)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}