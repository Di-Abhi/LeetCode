class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();  // Trim the leading and trailing spaces
        int n = s.length();
        int i = n - 1;
        int count = 0;
        // Iterate backwards until we encounter a space
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
