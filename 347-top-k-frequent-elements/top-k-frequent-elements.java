import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     int nums[]=new int[n];
    //     for (int i = 0; i < n; i++) {
    //         nums[i]=scan.nextInt();
    //     }
    //     int k=scan.nextInt();
    // }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a:nums){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}