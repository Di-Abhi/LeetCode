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
        Map<Integer,ListNode> mpp = new HashMap<>();
        ListNode dmyNode = new ListNode(0,head);
        int presum=0;
        ListNode temp = dmyNode;
        while(temp!=null){
            presum+=temp.val;
            mpp.put(presum,temp);
            temp=temp.next;
        }
        presum=0;
        temp=dmyNode;
        while(temp!=null){
            presum+=temp.val;
            temp.next=mpp.get(presum).next;
            temp=temp.next;
        }
        return dmyNode.next;
    }
}