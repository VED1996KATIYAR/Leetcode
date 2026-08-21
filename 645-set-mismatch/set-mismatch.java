import java.util.*;
public class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n=scan.nextInt();
    //     int nums[]=new int[n];
    //     for (int i=0;i<n;i++){
    //         nums[i]=scan.nextInt();
    //     }
        
    // }
    public static int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for (int a:nums){
            if(set.contains(a)){
                arr[0]=a;
            }else{
                set.add(a);
            }
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!set.contains(i)){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}