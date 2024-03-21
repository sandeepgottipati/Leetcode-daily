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
    public int pairSum(ListNode head) {
        if(head==null)return 0;
    ListNode slow=head;
        ListNode fast =head;
        ListNode mid=null;
        while(fast!=null && fast.next!=null){
            mid=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        mid.next=reverse(slow);
        
       int sum=0;
        ListNode curr=head;
        ListNode end=mid.next;
        
        
        while(end!=null){
            
         sum=Math.max(sum,curr.val+end.val);
            curr=curr.next;
            end=end.next;
        }
        return sum;
        
    }
    private ListNode reverse(ListNode dummy){
        ListNode curr=dummy;
        ListNode prev=null;
        
        while(curr!=null && curr.next!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        curr.next=prev;
        return curr;
    }
}