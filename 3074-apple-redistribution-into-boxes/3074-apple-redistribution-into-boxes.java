class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m = capacity.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=apple[i];
        }
        Arrays.sort(capacity);
        int cap=0;
        int j=m-1;
        int ans=0;
        while(cap<cnt&&j>=0){
            cap+=capacity[j];
            j--;
            ans++;
        }
        return ans;
    }
}