class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        int cnt = 0;
        
        for (int i = 0; i < size; i++) {
            if (flowerbed[i] == 0) {
                // Check left and right neighbors (handle edge cases for first and last elements)
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == size - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant a flower
                    cnt++;
                    
                    if (cnt >= n) return true;

                    i++; // Skip the next position as we cannot plant adjacent flowers
                }
            }
        }
        return cnt >= n;
    }
}
