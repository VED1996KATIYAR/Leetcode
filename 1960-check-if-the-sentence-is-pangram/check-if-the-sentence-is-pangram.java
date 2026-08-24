import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        boolean ans=checkIfPangram(sentence);
        System.out.println(ans);
    }
    public static boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        for(char c='a';c<='z';c++){
            if(!map.containsKey(c)){
                return false;
            }
        }
        return true;
    }
}