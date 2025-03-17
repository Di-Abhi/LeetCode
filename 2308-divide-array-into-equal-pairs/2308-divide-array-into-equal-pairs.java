class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> cnt = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }
        for(int count:cnt.values()){
            if(count%2!=0){
                return false;
            }
        }
        return true;
    }
}