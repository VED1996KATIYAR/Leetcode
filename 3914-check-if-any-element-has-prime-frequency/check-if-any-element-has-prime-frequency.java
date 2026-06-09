class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int a:nums){
            if(arr.containsKey(a)){
                arr.put(a,arr.get(a)+1);
            }else{
                arr.put(a,1);
            }
        }
        for(int b:arr.keySet()){
            int v=arr.get(b);
            if(v==2){
                return true;
            }
            int count=0;
            if(v==1){
                count++;
            }
            
            for(int i=2;i<v;i++){
                if(v%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                return true;
            }
        }
        return false;
    }
}