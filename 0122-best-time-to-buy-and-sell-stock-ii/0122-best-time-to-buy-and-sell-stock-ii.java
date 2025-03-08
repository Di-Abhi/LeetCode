class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy =0;
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            if(prices[i]<prices[i+1]){
                buy=prices[i];
                max+=prices[i+1]-buy;
            }
        }
        return max;
    }
}