class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        long sum=0;
        int cnt=0;
        int i=n-1;
        while(k>0){
            sum+=happiness[i];
            cnt++;
            if(i>0&&happiness[i-1]-cnt<=0){
                happiness[i-1]=0;
            }else if(i>0&&happiness[i-1]-cnt>0){
                happiness[i-1]-=cnt;
            }
            k--;
            i--;
        }
        return sum;
    }
}