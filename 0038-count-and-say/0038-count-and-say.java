class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String number = "1";

        for (int i = 2; i <= n; ++i) {
            StringBuilder res = new StringBuilder();
            int cnt = 1;
            char curr = number.charAt(0);

            for (int j = 1; j < number.length(); j++) {
                if (number.charAt(j) == curr) {
                    cnt++;
                } else {
                    res.append(cnt).append(curr);
                    curr = number.charAt(j);
                    cnt = 1;
                }
            }
            res.append(cnt).append(curr);
            number = res.toString();
        }

        return number;
    }
}
