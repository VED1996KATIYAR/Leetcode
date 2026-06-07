class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){arr.push(ch);}
            else{
                if(arr.size()==0) return false;
                else{
                   char chh=arr.peek();
                   if((chh=='{'&&ch=='}')||(chh=='['&&ch==']')||(chh=='('&&ch==')')){
                    arr.pop();
                   }else{
                    return false;
                   }
                }
            }
        }
        return arr.size()==0;
    }
}