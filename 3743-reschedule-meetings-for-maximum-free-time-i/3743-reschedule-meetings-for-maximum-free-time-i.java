class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int sum =0;
        int freeTime=0;
        int n= startTime.length;
        for(int i =0;i<n;i++){
            sum+=endTime[i]-startTime[i];
            int left = i<=k-1?0:endTime[i-k];
            int right = i==n-1?eventTime:startTime[i+1];
            freeTime=Math.max(freeTime,right-left-sum);
            if(i>=k-1){
                sum-=endTime[i-k+1]-startTime[i-k+1];
            }
        }
        return freeTime;
    }
}