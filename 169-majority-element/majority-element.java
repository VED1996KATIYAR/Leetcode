class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        if(nums.length%2!=0){
            k=(nums.length/2)+1;
        }else{
            k=(nums.length/2);
        }
        
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int a:nums){
            if(arr.containsKey(a)){
                arr.put(a,arr.get(a)+1);
            }else{
                arr.put(a,1);
            }
        }
        for(int a:arr.keySet()){
            if(arr.get(a)>=k){
                return a;
            }
        }
        return -1;
    }
}