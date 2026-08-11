public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        List<List<Integer>> list = new ArrayList<>(combinationSum3(k, n));
        System.out.println(list);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        combinationfind(1,k,n,new ArrayList<>(),list);
        return list;
    }
    public static void combinationfind(int start, int k, int n, List<Integer> list, List<List<Integer>> lists){
        if(n == 0 && k == 0){
            lists.add(new ArrayList<>(list));
            return;
        }

        if(n < 0 || k < 0 || start > 9){
            return;
        }
        //pick
        list.add(start);
        combinationfind(start+1,k-1,n-start,list,lists);
        list.remove(list.size()-1);
        //skip
        combinationfind(start+1,k,n,list,lists);
    }
}
