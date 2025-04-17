class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n-k];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(i>=k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}