class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int a:nums){
            arr.add(a);
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int b:arr){
            arr1.add(b);
        }
        Collections.sort(arr1);
        if(arr1.size()<3){
            return arr1.get(arr1.size()-1);
        }
        return arr1.get(arr1.size()-3);
    }
}

// 1 2 3 4 5 6 7

// 7-1-2=4