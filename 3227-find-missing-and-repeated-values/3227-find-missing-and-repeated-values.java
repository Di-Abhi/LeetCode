class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> map = new HashSet<>();
        int n = grid.length;
        int sq=n*n;
        int curSum=0;
        int ans[] = new int[2];
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
                if(map.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }else{
                    map.add(grid[i][j]);
                    curSum+=grid[i][j];
                }
            }
        }
        int totalSum=sq*(sq+1)/2;
        ans[1]=totalSum-curSum;
        return ans;

    }
}