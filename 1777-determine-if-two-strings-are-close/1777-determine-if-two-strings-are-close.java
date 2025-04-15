class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            arr1[c-'a']++;
            char c2=word2.charAt(i);
            arr2[c2-'a']++;
        }
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            if(arr2[c-'a']==0){
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}