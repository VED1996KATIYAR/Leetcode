// import java.util.ArrayList;

// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        if(arr.size()<=2){
            int arrr[]=new int[2];
            arrr[0]=-1;
            arrr[1]=-1;
            return arrr;
        }
        ArrayList<Integer>index=new ArrayList<>();
        int index1=1;
        while (index1<arr.size()-1){
            if(arr.get(index1-1)<arr.get(index1) && arr.get(index1)>arr.get(index1+1)){
                index.add(index1);
                index1++;
            }
            else if(arr.get(index1-1)>arr.get(index1)&& arr.get(index1)<arr.get(index1+1)){
                index.add(index1);
                index1++;
            }else{
                index1++;
            }
        }
        if(index.size()<2){
            return new int[]{-1,-1};
        }
        int arr1[]=new int[2];
        arr1[0]=Integer.MAX_VALUE;
        arr1[1]=Math.abs(index.get(index.size()-1)-index.get(0));
        for(int i=1;i<index.size();i++){
            arr1[0]=Math.min(arr1[0],Math.abs(index.get(i-1)-index.get(i)));
        }
        return arr1;
    }
}