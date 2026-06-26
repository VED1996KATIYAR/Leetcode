/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                count++;
                break;
            }
        }
        ListNode temp=head;

        if(count==1){
           while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
           }  
        }
        return count==1?temp:null;
    }
}