/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        ListNode temp=headA;
        while(temp!=null){
            l1+=1;
            temp=temp.next;
        }
        ListNode temp1=headB;
        while(temp1!=null){
            l2+=1;
            temp1=temp1.next;
        }
        ListNode skip=headA;
        ListNode skip1=headB;
        if(l1>l2){
            for(int i=1;i<=(l1-l2);i++){
                skip=skip.next;
            }
        }else{
            for(int j=1;j<=(l2-l1);j++){
                skip1=skip1.next;
            }
        }
        while(skip!=skip1){
            skip=skip.next;
            skip1=skip1.next;
        }
        return skip;
    }
}
//l1-length of headA
//l2-length of headB