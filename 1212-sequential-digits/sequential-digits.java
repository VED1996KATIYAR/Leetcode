class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<9;i++){
            int sum=i;
            for(int j=i+1;j<=9;j++){
                sum=(sum*10)+j;
                if(sum>=low && sum<=high){
                    arr.add(sum);
                }
            }
        }
       Collections.sort(arr);
        return arr;
    }
}