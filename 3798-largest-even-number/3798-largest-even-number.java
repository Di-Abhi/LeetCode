class Solution {
    public String largestEven(String s) {
        int n=s.length();
        int j=0;
        for(int i=n-1;i>=0;i--){
            int ch = ((s.charAt(i))-'0');
            if(ch%2==0){
                j=i+1;
                break;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<j;i++){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}