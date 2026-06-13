class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String aa="";
        for(int i=0;i<words.length;i++){
            String b=words[i];
            int sum=0;
            for(int j=0;j<b.length();j++){
                sum+=weights[b.charAt(j)-'a'];
            }
            int v=sum%26;
            aa+=(char)('z'-v);
        }
        return aa;
    }
}
//25-8+1
///agar kisi alhpa ko starting sa fetch krna hai toh (char)(v+'z')
//agar last mai toh (char)('z'-v);