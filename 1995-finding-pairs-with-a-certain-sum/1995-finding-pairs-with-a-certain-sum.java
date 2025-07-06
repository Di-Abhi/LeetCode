class FindSumPairs {
    int[] n1, n2;
    Map<Integer,Integer> mpp=new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=nums1;
        n2=nums2;
        for(int x:n2) mpp.put(x,mpp.getOrDefault(x,0)+1);
    }
    
    public void add(int index, int val) {
        mpp.put(n2[index],mpp.get(n2[index])-1);
        n2[index]+=val;
        mpp.put(n2[index],mpp.getOrDefault(n2[index],0)+1);
    }
    
    public int count(int tot) {
        int count =0;
        for(int x:n1) count+=mpp.getOrDefault(tot-x,0);
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */