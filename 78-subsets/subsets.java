class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list5 = new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        subset(list5,arr1,nums,0);
        return list5;
    }
    public static  void subset(List<List<Integer>> list5,List<Integer> arr1,int arr[],int index){
        if(index==arr.length){
            list5.add(new ArrayList<>(arr1));
            return;
        }
        arr1.add(arr[index]);
        subset(list5,arr1,arr,index+1);
        arr1.remove(arr1.size()-1);
        subset(list5,arr1,arr,index+1);
    }
}