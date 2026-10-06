class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> arr=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                arr.push(a);
            }else{
                    if(arr.size()!=0){
                    arr.pop();
                }else{
                    count++;
                }
            }

        }
        return arr.size()+count;
    }
}