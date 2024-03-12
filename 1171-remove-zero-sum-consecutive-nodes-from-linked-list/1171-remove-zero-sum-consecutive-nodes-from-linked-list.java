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
        HashMap<Integer,ListNode> hm=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        hm.put(0,dummy);
        ListNode curr=dummy.next;
        int prefixSum=0;
        while(curr!=null){
            prefixSum+=curr.val;
            if(hm.containsKey(prefixSum)){
                ListNode start=hm.get(prefixSum);
                ListNode temp=start;
                while(temp!=curr){
                    temp=temp.next;
                    prefixSum+=temp.val;
                    if(temp!=curr){
                        hm.remove(prefixSum);
                    }
                    

                
                }
                start.next=temp.next;
            }
            else{
                hm.put(prefixSum,curr);
            }
            curr=curr.next;
        }
        return dummy.next;
    }
    
}