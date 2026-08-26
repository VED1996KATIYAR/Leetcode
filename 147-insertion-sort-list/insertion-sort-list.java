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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            int d=temp.val;
            arr.add(d);
            temp=temp.next;
        }
        for(int j=1;j<arr.size();j++){
            int key=arr.get(j);
            int i=j-1;
            while(i>=0 && arr.get(i)>key){
                arr.set(i+1,arr.get(i));
                i-=1;
            }
            arr.set(i+1,key);
        }
        ListNode temp1=head;
        int index=0;
        while(temp1!=null){
            temp1.val=arr.get(index);
            index++;
            temp1=temp1.next;
        }
        return head;
    }
}