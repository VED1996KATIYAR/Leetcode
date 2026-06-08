class Solution {
    public int lengthOfLastWord(String s) {
        // int ctr=0;
        // String b="";
        // for(int i=s.length()-1;i>=0;i--){
        //     char a=s.charAt(i);
        //     if(a !=' '){
        //         b+=a;
        //         ctr+=1;
        //     }else if(ctr==0 && a ==' '){
        //         continue;
        //     }else{
        //         break;
        //     }
        // }
        // return ctr;
        String[]words=s.split(" ");
        String wor=words[words.length-1];
        int length=wor.length();
        return length;


        
    }
}