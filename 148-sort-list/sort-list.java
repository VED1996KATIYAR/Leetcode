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
    public ListNode sortList(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode head1=dummy;
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
        for(int a:arr){
            ListNode a1=new ListNode(a);
            head1.next=a1;
            head1=head1.next;
            
        }
        head1.next=null;
        return dummy.next;
    }
}