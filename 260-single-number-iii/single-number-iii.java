class Solution {
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
            
        }
        int arr[]=new int[2];
        int index=0;
        for(int a:set){
            arr[index]=a;
            index++;
            
        }
        return arr;
    }
}