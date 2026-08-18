class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        generate("",0,0,n,arr);
        return arr;
    }
    public static void generate(String s,int open,int close,int n,List<String> arr){
        if(s.length()==2*n){
            arr.add(s);
            return;
        }
        if(open<n){
            generate(s+"(",open+1,close,n,arr);
        }
        if(close<open){
            generate(s+")",open,close+1,n,arr);
        }
    }
}