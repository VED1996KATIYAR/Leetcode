class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length;
        int arr[]=new int[n+1];

        for(int i=digits.length-1;i>=0;i--){
            if(i==n-1){
                if(digits[i]<9){
                    digits[i]+=1;
                    carry=0;
                    return digits;
                }else{
                    digits[i]=0;
                    carry=1;
                }
            }else if(i==0){
                if(digits[i]<9){
                    digits[i]+=carry;
                    carry=0;
                    return digits;
                }else{
                    digits[i]=0;
                    carry=1;
                }
            }else{
                if(digits[i]<9){
                    digits[i]+=carry;
                    carry=0;
                    return digits;
                }else{
                    digits[i]=0;
                    carry=1;
                }
            }
        }
        arr[0]=1;
        int l=1;
        for(int k=1;k<n;k++){
            arr[l]=digits[k];
            l++;
        }
        return arr;
    }
}