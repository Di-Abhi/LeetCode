class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            a+=gain[i];
            max=Math.max(max,a);
        }
        return max;
    }
}