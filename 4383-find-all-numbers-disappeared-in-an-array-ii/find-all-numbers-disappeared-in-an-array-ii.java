import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[]=new int[n];
        int lower=scan.nextInt();
        int upper=scan.nextInt();
        List<List<Integer>> list=new ArrayList<>(findDisappearedNumbers(nums,lower,upper));
        System.out.println(list);
    }
    public static List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int start=-1;
        int end=-1;
        for(int j=lower;j<=upper;j++){
            if(!set.contains(j)){
                if(start==-1){
                    start=j;
                }
                end=j;
            }
            else{
                if(start!=-1){
                    ArrayList<Integer> list2=new ArrayList<>();
                    list2.add(start);
                    list2.add(end);
                    list.add(new ArrayList<>(list2));
                    start=-1;
                    end=-1;
                }

            }
        }
        if(start!=-1){
            ArrayList<Integer> list2=new ArrayList<>();
            list2.add(start);
            list2.add(end);
            list.add(new ArrayList<>(list2));
        }
        return list;
    }
}