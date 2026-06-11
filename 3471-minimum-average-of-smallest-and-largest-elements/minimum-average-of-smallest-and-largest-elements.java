class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Double> arr=new ArrayList<>();
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            double avg=(nums[start]+nums[end])/2.0;
            arr.add(avg);
            start++;
            end--;
        }
        Collections.sort(arr);
        return arr.get(0);
    }
}