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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(i != null & j != null ){
            if(i.val==j.val){
                ListNode head=new ListNode(j.val);
                i=i.next;
                k.next=head;
                k=k.next;
                ListNode head1=new ListNode(j.val);
                j=j.next;
                k.next=head1;
            }
            else if(i.val>j.val){
                ListNode head=new ListNode(j.val);
                j=j.next;
                k.next=head;
            }else{
                ListNode head=new ListNode(i.val);
                i=i.next;
                k.next=head;
            }
            k=k.next;
        }
        if(i==null){
            k.next=j;
        }else{
            k.next=i;
        }
        ListNode kk=k;
        return dummy.next;
    }
}