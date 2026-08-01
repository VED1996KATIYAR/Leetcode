import java.util.*;
public class Solution {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int M = sc.nextInt();
    //     int nums[][]=new int[N][M];
    //     for(int i=0;i<N;i++){
    //         for(int j=0;j<M;j++){
    //             nums[i][j]=sc.nextInt();
    //         }
    //     }
    //     List<Integer> list=new ArrayList<>(intersection(nums));
    //     System.out.println(list);
    // }
    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j],map.get(nums[i][j])+1);
                }else{
                    map.put(nums[i][j],1);
                }
            }
        }
        int l=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int k:map.keySet()){
            int g=map.get(k);
            if(g==l){
                list.add(k);
            }
        }
        Collections.sort(list);
        return list;
    }
}