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
    public void reorderList(ListNode head) {
        if(head.next==null || head==null)return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        ListNode end=slow;
        ListNode start=head;
        while(end.next!=null){
            ListNode prevStart=start.next;
            start.next=end;
            start=prevStart;
            prevStart=end.next;
            end.next=start;
            end=prevStart;
           
        }
        
        
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr.next!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        curr.next=prev;
        return curr;
    }
}