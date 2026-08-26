import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>(lexicalOrder(n));
        System.out.println(list);
    }
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list2.add(String.valueOf(i));
        }
        Collections.sort(list2);
        for(String a:list2){
            list.add(Integer.parseInt(a));
        }
        return list;
    }
}