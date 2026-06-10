class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        int index=0;
        for(int i=0;i<n-k+1;i++){
            int arr1[]=new int[k];
            int v=0;
            for(int j=i;j<i+k;j++){
                arr1[v++]=nums[j];
            }
            int check=0;
            //check kro ki ascending mai hai aur equal element nhi hai
            for(int l=0;l<k-1;l++){
                
                if(arr1[l]>arr1[l+1] || arr1[l+1]-arr1[l]!=1){
                    check++;
                    
                }
            }
            if(check==0){
                arr[index++]=arr1[k-1];
            }else{
                arr[index++]=-1;
            }
        }
        return arr;
    }
}