class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleast(k, word) - atleast(k + 1, word);
    }

    private boolean isConsonent(char ch) {
        return (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u');
    }

    private boolean isAllVowelsPresent(int freq[]) {
        return (freq['a' - 'a'] > 0 && freq['e' - 'a'] > 0 && freq['i' - 'a'] > 0 && freq['o' - 'a'] > 0
                && freq['u' - 'a'] > 0);
    }

    private long atleast(int k, String word) {
        long count = 0;
        int curConsonent = 0;
        int freq[] = new int[26];
        int n = word.length();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char ch = word.charAt(right);
            if (isConsonent(ch)) {
                curConsonent++;
            }
            freq[ch - 'a']++;

            while (curConsonent >= k && isAllVowelsPresent(freq)) {
                count += (n - right);
                char c = word.charAt(left);
                if (isConsonent(c)) {
                    curConsonent--;
                }
                freq[c - 'a']--;
                left++;
            }
        }
        return count;
    }

}