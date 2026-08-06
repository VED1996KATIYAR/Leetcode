import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     int words[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         words[i]=scan.nextInt();}
    //     int k=scan.nextInt();
    //     List<String> arr=new ArrayList<>(topKFrequent(words,k));
    //     System.out.println(arr);
    // }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
                
            }else{
                map.put(word,1);
            }
        }
        List<String> ans=new ArrayList<>(map.keySet());
        ans.sort((a, b) -> {
    if (map.get(a)==(map.get(b))) {
        return a.compareTo(b);   
    }
    return map.get(b) - map.get(a); });
        List<String> ans1=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans1.add(ans.get(i));
        }
        return ans1;
    }
}