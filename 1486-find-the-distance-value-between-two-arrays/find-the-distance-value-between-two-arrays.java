import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr1[]=new int[N];
        int M = input.nextInt();
        int arr2[]=new int[M];
        int d=input.nextInt();
        for(int i=0;i<N;i++){
            arr1[i]=input.nextInt();
        }
        for(int i=0;i<M;i++){
            arr2[i]=input.nextInt();
        }
        int ans=findTheDistanceValue(arr1,arr2,d);
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int counter=0;
        for(int i=0;i<arr1.length;i++){
            boolean check=true;
            for(int j=0;j<arr2.length;j++){
                int ans=Math.abs(arr1[i]-arr2[j]);
                if(ans<=d){
                    check=false;
                    break;
                }
            }
            if(check){
                counter++;
            }
        }
        return counter;
    }
}