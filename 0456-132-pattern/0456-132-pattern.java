class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE; // This stores the "2" element in 132 pattern

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true; // Found the 132 pattern
            }
            
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // Update third with the popped element
            }

            stack.push(nums[i]); // Push the current element onto the stack
        }

        return false;
    }
}