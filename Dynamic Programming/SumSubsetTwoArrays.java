import java.util.*;

public class SumSubsetTwoArrays {

    // Finding the sum of subsets pf 2 arrays where there are no adjacent elements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,3,4,-8,2};
        int[] b = {-5,8,3,1,-4};
        int[] dp = new int[5];

        dp[0] = Math.max(a[0], b[0]);
        dp[1] = Math.max(dp[0], Math.max(a[1], b[1]));
        dp[2] = Math.max(dp[1], Math.max(a[2] + dp[0], b[2]+dp[0]));
        System.out.println("Index till which you want the subset-sum");
        int index = sc.nextInt();
        if(index > 2){
            for(int i=3; i<=index; i++){
                dp[i] = Math.max(dp[i-1], Math.max(a[i] + dp[i-2], b[i] + dp[i-2]));
                System.out.println(dp[i]);
            }
        }
        else if(index == 1){
            System.out.println(dp[1]);
        }
        else if( index == 2){
            System.out.println(dp[2]);
        }
        else{
            System.out.println(dp[0]);
        }
        sc.close();
    }
}
