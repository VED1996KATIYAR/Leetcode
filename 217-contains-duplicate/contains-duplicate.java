class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    int length=nums.length-1;
    //    HashSet<Integer> set=new HashSet<Integer>();
    //    for(int i=0;i<=length;i++){
    //     if(set.contains(nums[i])){
    //         return true;
    //     }else{
    //         set.add(nums[i]);
    //     }
    //    }
    //    return false;
    HashMap<Integer,Integer> arr=new HashMap<>();
    for(int a:nums){
        if(arr.containsKey(a)){
            arr.put(a,arr.get(a)+1);
        }else{
            arr.put(a,1);
        }
    }
    for(int b:arr.keySet()){
        if(arr.get(b)>=2){
            return true;
        }
    } 
    return false;
    }
}