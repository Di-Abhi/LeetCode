class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int n = candies.length;
        int max=Integer.MIN_VALUE;
        for(int num:candies){
            max=Math.max(max,num);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}