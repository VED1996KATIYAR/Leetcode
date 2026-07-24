class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        int count=0;
        char [] ss=s.toCharArray();
        ArrayList<Character> ss1 = new ArrayList<>();
        for(char ch:ss){
            ss1.add(ch);
        }
        ArrayList<Character> ss2 = new ArrayList<>();
        for(char ch:ss){
            ss2.add(ch);
        }
        while(start<=end){
            char ch=ss[start];
            char ch1=ss[end];
            if(ch!=ch1){
                ss1.remove(start);
                ss2.remove(end);
                boolean check=palindrome(ss1);
                boolean check1=palindrome(ss2);
                if(check || check1){
                    return true;
                }else{
                    return false;
                }
            }
            start++;
            end--;
        }

        return true;
    }
    public static boolean palindrome(ArrayList<Character> ss){
        int start=0;
        int end=ss.size()-1;
        while(start<=end){
            if(ss.get(start)!=ss.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}