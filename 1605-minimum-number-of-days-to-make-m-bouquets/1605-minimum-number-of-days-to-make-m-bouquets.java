class Solution {
    public boolean poss(int[] arr,int mid,int m,int k ){
        int n = arr.length;
        int cnt =0;
        int noOfB = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=mid){
                cnt++;
            }else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        return noOfB>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m*k;
        int n = bloomDay.length;
        if(val>n) return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:bloomDay){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int left = min, right=max;
        while(left<=right){
            int mid = (left+right)/2;
            if(poss(bloomDay,mid,m,k)){
                right = mid-1; 
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}