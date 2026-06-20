class Solution {
    public List<Integer> majorityElement(int[] nums) {
        double length=Math.floor(nums.length/3);
        int length1=(int)length;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int a:nums){
            if(arr.containsKey(a)){
                arr.put(a,arr.get(a)+1);
            }else{
                arr.put(a,1);
            }
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int b:arr.keySet()){
            if(arr.get(b)>length1){
                arr1.add(b);
            }
        }
        return arr1;
    }
}