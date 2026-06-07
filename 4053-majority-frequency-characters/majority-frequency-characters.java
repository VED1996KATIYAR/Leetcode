class Solution {
    public String majorityFrequencyGroup(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        //hashmap
        HashMap<Integer,Integer> arr1=new HashMap<>();
        //frequency,total frequency
        for(int a:arr){
            if(a!=0){
                if(arr1.containsKey(a)){
                    arr1.put(a,arr1.get(a)+1);
                }else{
                    arr1.put(a,1);
                }
            }
        }
        int maxvalue=0;
        int key=0;
        for(int b:arr1.keySet()){
            if(arr1.get(b)>maxvalue ||(maxvalue==arr1.get(b) && b>key)){
                maxvalue=arr1.get(b);
                key=b;
            }
        }
        String ss="";
        for(int i=0;i<26;i++){
            if(arr[i]==key){
                ss+=(char) (i+'a');
            }
        }
        return ss;
    }
}

