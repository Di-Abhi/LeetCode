class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        int maxCount = 0;
        Map<Character, Integer> mpp = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, mpp.get(c));

            
            if ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}