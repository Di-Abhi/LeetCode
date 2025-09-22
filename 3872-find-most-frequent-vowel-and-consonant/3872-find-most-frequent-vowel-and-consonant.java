class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            freq[ch]++;
        }
        int maxV=0;
        int maxC=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                maxV=Math.max(maxV,freq[i]);
            }else{
                maxC=Math.max(maxC,freq[i]);
            }
        }
        return maxV+maxC;
    }
}