class Solution {
    public String processStr(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                result=result.concat(result);
            }
            else if(ch=='*'){
                if(result.length()==1){
                    result="";
                }else if(result.equals("")){
                    result="";
                    }else{
                result=result.substring(0,result.length()-1);}
            }else if(ch=='%'){
                String result1="";
                for(int j=result.length()-1;j>=0;j--){
                    result1+=result.charAt(j);
                }
                result="";
                result=result1;
            }else{
                result+=ch;
            }
        }
        return result;
    }
}