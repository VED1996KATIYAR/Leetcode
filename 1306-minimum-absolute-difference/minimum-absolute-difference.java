//package leetcode;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>(minimumAbsDifference(arr));
        System.out.println(list);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int d=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            
                int d1=Math.abs(arr[i]-arr[i+1]);
                d=Math.min(d1,d);
            
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            List<Integer> list1=new ArrayList<>();
            
                if(arr[i]<arr[i+1]){
                    if(Math.abs(arr[i]-arr[i+1])==d){
                        list1.add(arr[i]);
                        list1.add(arr[i+1]);
                        list.add(list1);
                    }
                }
            
            
        }
        return list;

    }
}