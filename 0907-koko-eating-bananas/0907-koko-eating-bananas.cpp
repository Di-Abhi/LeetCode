class Solution {
public:
    int fn(vector<int>& arr, int h, int mid) {
        int curH = 0;
        for (int i : arr) {
            curH+=i/mid;
            if(i%mid!=0){
                curH++;
            }
            if (curH > h) {
                return false;
            }
        }
        return true;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1;
        int high = INT_MIN;
        for (int i : piles) {
            high = max(i, high);
        }
        int ans = high;
        while (low <= high) {
            int mid = (low + high) >> 1;
            bool poss = fn(piles, h, mid);
            if (poss) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
};