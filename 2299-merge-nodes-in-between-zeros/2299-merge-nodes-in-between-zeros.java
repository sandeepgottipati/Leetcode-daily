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
    public ListNode mergeNodes(ListNode head) {

        head=head.next;
        ListNode start=new ListNode(0);
        ListNode curr=start;
        int sum=0;
        ListNode temp=head;
        
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }
            else{
                if(sum!=0){
                    curr.next=new ListNode(sum);
                    curr=curr.next;
                    sum=0;
                }
            }
        
           temp=temp.next;
           
        }
        
        return start.next;


    }
}