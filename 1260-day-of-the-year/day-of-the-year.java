import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        int ans=dayOfYear(data);
        System.out.println(ans);
    }
    public static int dayOfYear(String date) {
        String []arr=date.split("-");
        int year=Integer.parseInt(arr[0]);
        int month=Integer.parseInt(arr[1]);
        int day=Integer.parseInt(arr[2]);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(31);
        list.add(28);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(30);
        list.add(31);
        boolean flag=(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(flag){
            list.set(1,29);
        }
        int total=0;
        for(int i=0;i<month-1;i++){
            total+=list.get(i);
        }
        return total+day;
    }
}