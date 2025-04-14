class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i =0;i<magazine.length();i++){
            char ch= magazine.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!mpp.containsKey(ch) || mpp.get(ch) == 0) {
                return false;
            }
            mpp.put(ch, mpp.get(ch) - 1);
        }

        return true;
    }
}