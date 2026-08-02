import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     int nums[]=new int[n];
    //     for (int i = 0; i < n; i++) {
    //         nums[i]=scan.nextInt();
    //     }
    //     int sum=sumFourDivisors(nums);
    // }
    public static int sumFourDivisors(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            int sum1=0;
            int count=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    if(j*j==nums[i]){
                        count+=1;
                        sum1+=nums[i];
                    }else{
                        sum1+=j+nums[i]/j;
                        count+=2;
                    }
                }
                
                    
            }   
            if(count==4){
                totalsum+=sum1;
            }
        }
        return totalsum;
    }
}