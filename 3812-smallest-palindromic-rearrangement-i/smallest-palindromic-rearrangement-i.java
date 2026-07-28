// // package leetcode;
// import java.util.*;
// public class Solution {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String s = in.nextLine();
//         String ans=smallestPalindrome(s);
//         System.out.println(ans);

//     }
//     public static String smallestPalindrome(String s) {
//         if(s.length()<2) return s;
//         String total="";
//         int l=s.length();
//         if(l%2==0){
//             String start="";
//             for (int i=0;i<l/2;i++){
//                 start=start+s.charAt(i);
//             }
//             String start1=first(start);
//             String end="";
//             for(int i=l/2;i<l;i++){
//                 end=end+s.charAt(i);
//             }
//             String end1=second(end);
//             total=start1+end1;
//         }else{
//             String start="";
//             for (int i=0;i<l/2;i++){
//                 start=start+s.charAt(i);
//             }
//             String start1=first(start);
//             int m=l/2;
//             char middle=s.charAt(m);
//             String end="";
//             for(int i=(l/2)+1;i<l;i++){
//                 end=end+s.charAt(i);
//             }
//             String end1=second(end);
//             total=start1+middle+end1;
//         }
//         return total;
//     }
//     public static String second(String s){
//         int arr[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-'a']++;
//         }
//         String ans="";
//         for(int j=25;j>=0;j--){
//             if(arr[j]>0){
//                 for(int i=0;i<arr[j];i++){
//                     ans=ans+(char)(j+'a');
//                 }
//             }
//         }
//         return ans;
//     }
//     public static String first(String s){
//         int arr[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-'a']++;
//         }
//         String ans="";
//         for(int i=0;i<26;i++){
//             if(arr[i]!=0){
//                 for(int j=0;j<arr[i];j++){
//                     ans=ans+(char)(i+'a');
//                 }
//             }
//         }
//         return ans;
//     }
// }

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = smallestPalindrome(s);
        System.out.println(ans);
    }

    public static String smallestPalindrome(String s) {
        if (s.length() < 2) return s;

        String total = "";
        int l = s.length();

        if (l % 2 == 0) {
            StringBuilder start = new StringBuilder();

            for (int i = 0; i < l / 2; i++) {
                start.append(s.charAt(i));
            }

            String start1 = first(start.toString());

            StringBuilder end = new StringBuilder();

            for (int i = l / 2; i < l; i++) {
                end.append(s.charAt(i));
            }

            String end1 = second(end.toString());

            total = start1 + end1;
        } else {
            StringBuilder start = new StringBuilder();

            for (int i = 0; i < l / 2; i++) {
                start.append(s.charAt(i));
            }

            String start1 = first(start.toString());

            char middle = s.charAt(l / 2);

            StringBuilder end = new StringBuilder();

            for (int i = (l / 2) + 1; i < l; i++) {
                end.append(s.charAt(i));
            }

            String end1 = second(end.toString());

            total = start1 + middle + end1;
        }

        return total;
    }

    public static String second(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for (int j = 25; j >= 0; j--) {
            while (arr[j]-- > 0) {
                ans.append((char) (j + 'a'));
            }
        }

        return ans.toString();
    }

    public static String first(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (arr[i]-- > 0) {
                ans.append((char) (i + 'a'));
            }
        }

        return ans.toString();
    }
}