class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int colsize=strs[0].length();
        int cnt=0;
        for(int i=0;i<colsize;i++){
            int flag=0;
            for(int j=1;j<n;j++){
                char s1=strs[j-1].charAt(i);
                char s2=strs[j].charAt(i);
                if(s2<s1){
                    flag=1;
                }
            }
            if(flag==1){
                cnt++;
            }
        }
        return cnt;
    }
}