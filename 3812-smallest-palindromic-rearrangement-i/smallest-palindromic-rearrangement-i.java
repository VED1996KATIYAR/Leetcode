// package leetcode;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=smallestPalindrome(str);
    }
    public static String smallestPalindrome(String s) {
        String ans="";
        int len=s.length();
        if(len%2==0){
            StringBuilder start=new StringBuilder();
            StringBuilder end=new StringBuilder();
            for(int i=0;i<len/2;i++){
                start.append(s.charAt(i));
            }
            String start1=first(start.toString());
            for(int j=len/2;j<len;j++){
                end.append(s.charAt(j));
            }
            String end1=second(end.toString());
            ans=start1+end1;

        }else{
            StringBuilder start=new StringBuilder();
            StringBuilder end=new StringBuilder();
            for(int i=0;i<len/2;i++){
                start.append(s.charAt(i));
            }
            String start1=first(start.toString());
            char ch=s.charAt(len/2);
            for(int j=(len/2)+1;j<len;j++){
                end.append(s.charAt(j));
            }
            String end1=second(end.toString());
            ans=start1+ch+end1;
        }
        return  ans;
    }
    public static String first(String s) {
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            for(int j=0;j<arr[i];j++){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
    public static String second(String s) {
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=25;i>=0;i--){
            for(int j=0;j<arr[i];j++){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}
