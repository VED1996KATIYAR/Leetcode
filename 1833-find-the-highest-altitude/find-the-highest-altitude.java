class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length];
        arr[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            arr[i]=gain[i]+arr[i-1];
        }
        Arrays.sort(arr);
        return arr[arr.length-1]>0?arr[arr.length-1]:0;
    }
}