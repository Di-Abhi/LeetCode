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
    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        ListNode curr = head;
        if(head==null){
            return head;
        }
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        size++;
        k=k%size;
        curr.next=head;
        ListNode prev= head;
        int t=size-k;
        while(t>0){
            t--;
            prev=head;
            head=head.next;
        }
        prev.next=null;
        return head;
    }
}