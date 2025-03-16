class Solution {
    public boolean poss(int[] ranks,long time,int cars){
        long carcnt=0;
        for(int rank:ranks){
            carcnt+= (long) (Math.sqrt((1.0*time)/rank));
            if(carcnt>=cars) return true;
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        int n =ranks.length;
        long start=Integer.MAX_VALUE;
        long end=Integer.MIN_VALUE;
        for(int rank:ranks){
            start=Math.min(start,rank);
            end=Math.max(end,rank);
        }
        end=end*cars*cars;
        long ans=0;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(poss(ranks,mid,cars)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
        
    }
}