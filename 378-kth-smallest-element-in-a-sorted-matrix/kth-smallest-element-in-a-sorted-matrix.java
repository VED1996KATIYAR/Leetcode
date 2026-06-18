class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int []row:matrix){
            for(int element:row){
                arr.add(element);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}