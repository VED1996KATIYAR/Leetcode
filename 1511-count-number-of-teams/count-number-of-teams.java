import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int n=in.nextInt();
    //     int rating[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         rating[i]=in.nextInt();
    //     }
    //     int count=numTeams(rating);
    //     System.out.println(count);
    // }
    public static int numTeams(int[] rating) {
        int count=0;
        for(int i=0;i<rating.length;i++){
            for(int j=i+1;j<rating.length;j++){
                for(int k=j+1;k<rating.length;k++){
                    if((rating[i]<rating[j]&&rating[j]<rating[k])||(rating[i]>rating[j] && rating[j]>rating[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
