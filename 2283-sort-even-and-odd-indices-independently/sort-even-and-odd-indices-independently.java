import java.util.*;
class Solution {

    public static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                even.add(nums[i]);
            }else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int[] res = new int[nums.length];
        int index = 0;
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2==0){
                res[i] = even.get(evenIndex);
                evenIndex++;
            }else{
                res[i] = odd.get(oddIndex);
                oddIndex++;
            }
        }
        return res;
    }
}
//odd-descreasing
//even-ascending