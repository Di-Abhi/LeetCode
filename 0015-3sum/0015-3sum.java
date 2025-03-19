class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                List<Integer> list = new ArrayList<>();
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    
                    res.add(list);
                }
                else if(sum>0) k--;
                else j++;
            }
        }
        return new ArrayList<List<Integer>>(res);
    }
}