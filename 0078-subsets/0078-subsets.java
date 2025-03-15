class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return res;
    }
    public void solve(int[] nums,int ind,List<Integer> sublist){
        if(ind==nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[ind]);
        solve(nums,ind+1,sublist);
        sublist.remove(sublist.size()-1);
        solve(nums,ind+1,sublist);
    }
}