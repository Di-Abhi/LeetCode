class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalVal=0,start=0,currval=0,n=gas.length;
        for(int i=0;i<n;i++){
            totalVal+=gas[i]-cost[i];
            currval+=gas[i]-cost[i];
            if(currval<0){
                start=i+1;
                currval=0;
            }
        }
        return totalVal>=0?start:-1;
    }
}