class Solution {
    public int findClosest(int x, int y, int z) {
        int ans1=Math.abs(z-x);
        int ans2=Math.abs(z-y);
        if(ans1<ans2){
            return 1;
        }
        else if(ans1==ans2){
            return 0;
        }
        return 2;
    }
}