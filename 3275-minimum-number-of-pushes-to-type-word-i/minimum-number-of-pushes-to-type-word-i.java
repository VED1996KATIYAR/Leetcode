
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int ans=minimumPushes(word);
    }
    public static int minimumPushes(String word) {
        int arr[]=new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        for(int i=25;i>=0;i--){
            if(arr[i]!=0){
                if(count>=0 && count<=7){
                    count++;
                    sum+=arr[i]*1;
                }
                else if(count>7 && count<=15){
                    count++;
                    sum+=arr[i]*2;
                }else if(count>15 && count<=23){
                    count++;
                    sum+=arr[i]*3;
                }else{
                    sum+=arr[i]*4;
                }
            }
        }
        return sum;

    }
}