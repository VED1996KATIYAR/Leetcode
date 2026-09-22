import java.util.*;
class Solution {
    public static int countCharacters(String[] words, String chars) {
        int arr[]=new int[26];
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a']++;
        }
        int ans=0;
        for(String word:words){
            int temp[]=arr.clone();
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                if(temp[word.charAt(i) - 'a']>0){
                    temp[word.charAt(i) - 'a']--;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans+=word.length();
            }
        }
        return ans;
    }
}