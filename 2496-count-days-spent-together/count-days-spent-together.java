import java.util.*;
class Solution {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start=getdays(arriveAlice);
        int end=getdays(leaveAlice);
        int start1=getdays(arriveBob);
        int end1=getdays(leaveBob);
        int startdays=Math.max(start1,start);
        int enddays=Math.min(end1,end);
        if(startdays<=enddays){
            return enddays-startdays+1;
        }
        return 0;
    }
    public static int getdays(String days) {
        String[] arr = days.split("-");
        int current=Integer.parseInt(arr[1]);
        int month=Integer.parseInt(arr[0]);
        int sum=0;
        int months[]={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1;i<month;i++)
        {
            sum+=months[i];
        }
        return sum+current;
    }
}