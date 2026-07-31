// package leetcode;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int nums[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int primee= diagonalPrime(nums);
        System.out.println(primee);
    }
    public static int diagonalPrime(int[][] nums) {
        int prime=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i][i];
            int b=nums[i][nums.length-1-i];
            boolean check1=prime(a);
            boolean check2=prime(b);
            if(check1){
                prime=Math.max(prime,a);
            }
            if(check2){
                prime=Math.max(prime,b);
            }

        }
        return prime;
    }
    public static boolean prime(int a){
        if(a<=1){
            return false;
        }
        int count=0;
        for (int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
//An integer is prime if it is greater than 1 and has
//no positive
//integer divisors other than 1 and itself.