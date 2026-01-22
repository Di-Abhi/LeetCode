class Solution {
    public int countSegments(String s) {
        int n = s.length();
        if(n==0)return 0;
        int cnt =0;
        if(s.charAt(0)!=' ')cnt++;
        for(int i=1;i<n;i++){
            if((s.charAt(i-1)==' '&&s.charAt(i)!=' ')){
                cnt++;
            }
        }
        return cnt;
    }
}