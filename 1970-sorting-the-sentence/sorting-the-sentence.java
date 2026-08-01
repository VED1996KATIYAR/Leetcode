import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ans=sortSentence(s);
        System.out.println(ans);
    }
    public static String sortSentence(String s) {
        String words[]=s.split(" ");
        HashMap<Integer,String> map=new HashMap<>(sortHashMap(words));
        StringBuffer sb=new StringBuffer();
        int l=words.length;
        for(int i=1;i<=l;i++){
            for(int a:map.keySet()){
                
                if(i==a){
                    sb.append(map.get(a)).append(" ");
                    break;
                }
            }
        }
        return sb.toString().trim();

    }
    public static  HashMap<Integer,String> sortHashMap(String words[]){
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            StringBuffer sb=new StringBuffer();
            for(int k = 0; k< words[i].length(); k++){
                char ch=words[i].charAt(k);
                if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                    int v=ch-'0';
                    map.put(v,sb.toString());
                }else{
                    sb.append(ch);
                }
            }
        }
        return map;
    }
}