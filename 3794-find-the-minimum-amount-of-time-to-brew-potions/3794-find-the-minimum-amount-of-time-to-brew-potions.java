class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] sPre = new long[n];
        for (int i = 1; i < n; i++) 
            sPre[i] = sPre[i - 1] + skill[i];

        long tSum = (long) skill[0] * mana[0];

        for (int j = 1; j < m; j++) {
            long tMax = (long) skill[0] * mana[j];
            for (int i = 1; i < n; i++) {
                long tDiff = sPre[i] * mana[j - 1] - sPre[i - 1] * mana[j];
                if (tDiff > tMax) 
                    tMax = tDiff;
            }
            tSum += tMax;
        }
        return tSum + sPre[n - 1] * mana[m - 1];
    }
}