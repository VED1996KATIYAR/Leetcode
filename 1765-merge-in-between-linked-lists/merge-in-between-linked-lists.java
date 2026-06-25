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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dum=new ListNode(-1);
        ListNode start=dum;
        
        ListNode dum2=new ListNode(-1);
        ListNode end=dum2;
        int counter=0;
        ListNode temp=list1;
        while(temp!=null && counter<a){
            if(counter<a){
                ListNode n=new ListNode(temp.val);
                start.next=n;
                start=start.next;
            }
            counter++;
            temp=temp.next;
        }
        ListNode temp1=list2;
        while(temp1!=null){
            start.next=temp1;
            start=start.next;
            temp1=temp1.next;;
        }
        while(temp!=null){
            if(counter>b){
                start.next=temp;
                start=start.next;
            }
            counter++;
            temp=temp.next;
        }

    return dum.next;
    }
}