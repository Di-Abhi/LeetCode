class Solution {
    public String convert(String s, int numRows) {
        String[] ans=new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int ind =0;ind<numRows&& i<s.length();ind++){
                ans[ind]+=s.charAt(i++);
            }
            for(int ind=numRows-2;ind>0&&i<s.length();ind--){
                ans[ind]+=s.charAt(i++);
            }
        }
        String res="";
        for(String str:ans){
            res+=str;
        }
        return res;
    }
}