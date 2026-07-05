class Solution {
    public int maxDigitRange(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];ArrayList<Integer> arr2=new ArrayList<>();
            while(temp!=0){
                int mod=temp%10;
                arr2.add(mod);
                temp/=10;
            }
            Collections.sort(arr2);
            int range=arr2.get(arr2.size()-1)-arr2.get(0);
            arr.add(range);
            arr1.add(range);
        }
        Collections.sort(arr);
        
        int max=arr.get(arr.size()-1);
        
        int maximum=0;
        int index=0;
        for(int a:arr1){
            
            if(a==max){
                maximum+=nums[index];
            }
            index++;
        }
        return maximum;
        
    }
}