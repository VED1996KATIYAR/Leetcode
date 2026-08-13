// package DAY4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<List<Integer>> list=new ArrayList<>(combine(n,k));
        System.out.println(list);
    }
    public static List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        combination(1,n,k,new ArrayList<>(),list);
        return list;
    }
    public static void  combination(int start,int n,int k,List<Integer> list,ArrayList<List<Integer>> result){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        if(start>n){
            return;
        }
        list.add(start);
        combination(start+1,n,k,list,result);
        list.remove(list.size()-1);
        combination(start+1,n,k,list,result);

    }
}
