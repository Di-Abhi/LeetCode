/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode tmp = new ListNode(0);
        tmp.next=head;
        int presum=0;
        Map<Integer, ListNode> mpp = new HashMap<>();

        for(ListNode curr=tmp;curr!=null;curr=curr.next){
            presum+=curr.val;
            if(mpp.containsKey(presum)){
                ListNode prev = mpp.get(presum);
                ListNode del = prev.next;
                int p = presum+(del!=null?del.val:0);
                while(p!=presum){
                    mpp.remove(p);
                    del=del.next;
                    p+=(del!=null?del.val:0);
                }
                prev.next=curr.next;
            }else{
                mpp.put(presum,curr);
            }

        }
        return tmp.next;
    }
}