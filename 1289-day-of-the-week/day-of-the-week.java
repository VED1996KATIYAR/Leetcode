import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day=scan.nextInt();
        int month=scan.nextInt();
        int year=scan.nextInt();
        String ans=dayOfTheWeek(day,month,year);
        System.out.println(ans);
    }
    public static String dayOfTheWeek(int day, int month, int year) {
        ArrayList<String> day1=new ArrayList<>();
        day1.add("Friday");
        day1.add("Saturday");
        day1.add("Sunday");
        day1.add("Monday");
        day1.add("Tuesday");
        day1.add("Wednesday");
        day1.add("Thursday");
        ArrayList<Integer> day2 = new ArrayList<>(
                Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        );
        int total=0;
        for(int i=1971;i<year;i++){
            if((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)){
                total+=366;
            }else {
                total+=365;
            }
        }
        total+=day;
        boolean check=(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if(check){
            day2.set(1,29);
        }
        for (int i=0;i<month-1;i++){
            total+=day2.get(i);
        }
        return day1.get((total-1)%7);

    }
}
//1971
//(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)