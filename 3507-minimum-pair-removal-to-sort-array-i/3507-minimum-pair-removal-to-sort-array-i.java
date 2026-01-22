class Solution {
    class Pair implements Comparable<Pair>{
        int idx;
        long val,sum;
        Pair left,right;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
        public int compareTo(Pair p){
            if(this.right==null||p.right==null){
                return this.right==null?1:-1;
            }
            long diff = this.sum-p.sum;
            return (diff!=0)?(diff<0?-1:1):(this.idx-p.idx);
        }
    }
    public int minimumPairRemoval(int[] nums) {
        TreeSet<Pair> set = new TreeSet<>();
        int mismatch=0;
        Pair prev = null;
        for(int i=0;i<nums.length;i++){
            Pair curr = new Pair(i,nums[i]);
            if(prev==null){
                prev=curr;
            }else{
                if(curr.val<prev.val)mismatch++;
                prev.right=curr;
                curr.left=prev;
                prev.sum=prev.val+curr.val;
                set.add(prev);
                prev=curr;
            }
        }
        set.add(prev);
        int cnt =0;
        while(mismatch>0){
            Pair best = set.pollFirst();
            if(best.right.val<best.val)mismatch--;
            best.sum=best.val+best.right.sum;
            best.val=best.val+best.right.val;
            Pair del = best.right;
            best.right=del.right;
            if(del.right!=null){
                if(del.right.val<del.val)mismatch--;
                del.right.left=best;
                if(best.val>best.right.val)mismatch++;
            }
            set.remove(del);
        set.add(best);
        Pair left = best.left;
        if(left!=null){
            set.remove(left);
            if(left.val>left.sum-left.val)mismatch--;
            if(left.val>best.val)mismatch++;
            left.sum=left.val+best.val;
            left.right=best;
            set.add(left);
        }
        cnt++;
        }
        return cnt;
    }
}