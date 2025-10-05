class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int num : nums1) s1.add(num);

        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) s2.add(num);

        Set<Integer> diff1 = new HashSet<>(s1);
        diff1.removeAll(s2); 

        Set<Integer> diff2 = new HashSet<>(s2);
        diff2.removeAll(s1); 

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(diff1));
        ans.add(new ArrayList<>(diff2));

        return ans;
    }
}
