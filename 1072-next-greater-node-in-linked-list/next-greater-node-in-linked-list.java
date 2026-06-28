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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode slow=head;
        while(slow!=null){
            ListNode fast=slow.next;
            int count=0;
            while(fast!=null && count==0){
                if(fast.val>slow.val){
                    count=fast.val;
                }
                fast=fast.next;
            }
            arr.add(count);
            slow=slow.next;
        }
        int arr1[]=new int[arr.size()];
        int index=0;
        for(int b:arr){
            arr1[index]=b;
            index++;
        }
        return arr1;
    }
}