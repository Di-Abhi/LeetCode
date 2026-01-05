class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int cnt=0;
        long sum=0;
        long minVal=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<0){
                    cnt++;
                }
                long val=Math.abs(matrix[i][j]);
                minVal=Math.min(minVal,val);
                sum+=val;
            }
        }
        if(cnt%2==0) return sum;
        return sum-2*minVal;
    }
}