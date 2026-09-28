class Solution {
    public int maxDepth(String s) {
        Stack<Character> arr=new Stack<>();
        int max=0;
        int current=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                current+=1;
                if(max<current){
                    max=current;
                }
            }
            if(ch==')'){
                current-=1;
                if(max<current){
                    max=current;
                }
            }
        }
        return max;
    }
}