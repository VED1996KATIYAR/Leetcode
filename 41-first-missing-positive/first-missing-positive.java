class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> arr=new HashSet<Integer>();
        for(int a:nums){
            arr.add(a);
        }
        int i=1;
        while(true){
            if(!arr.contains(i)){
                return i;
            }
            i++;
        }
        
    }
}