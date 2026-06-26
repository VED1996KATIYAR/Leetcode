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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        ListNode dum=new ListNode(-1);
        ListNode head1=dum;
        for(int a:arr){
            if(a!=val){
                ListNode n=new ListNode(a);
                head1.next=n;
                head1=head1.next;
            }
        }
        head1.next=null;
        return dum.next;
    }
}