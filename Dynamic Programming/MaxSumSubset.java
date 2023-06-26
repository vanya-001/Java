import java.util.*;

public class MaxSumSubset {
    // Finding the maximun sum-subset such that no two elements should be adjacent.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,-3,5,-8,7};
        int[] dp = new int[5];
        dp[0] = Math.max(a[0], 0);
        dp[1] = Math.max(a[0],a[1]);
        dp[2] = Math.max(dp[1], dp[1] + a[2]);

        System.out.println("Enter the index till which you want the sum of subset");
        int index = sc.nextInt();
        if(index > 2){
            for(int i=3; i<index; i++){
                dp[i] = Math.max(dp[i-1], a[i]+dp[i-2]);
                System.out.println(dp[i]);
            }
        }
        else if(index == 2){
            System.out.println(dp[2]);
        }
        else if(index == 1){
            System.out.println(dp[1]);
        }
        else{
            System.out.println(dp[0]);
        }
        sc.close();
    }
}
