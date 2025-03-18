class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt=0;
        int i =0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                cnt++;
            }
            else{
                j++;
            }

        }
        if(cnt==s.length()){
            return true;
        }
        return false;
    }
}