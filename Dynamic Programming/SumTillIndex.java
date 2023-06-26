import java.util.*;

public class SumTillIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        // int n; 
        // n= sc.nextInt();
        // int[] a = new int[10];
        // for(int i=0; i<10; i=i+1){
        //     System.out.println("Enter the elements in array");
        //     a[i] = sc.nextInt();
        // }
        int[] dp = new int[5];
        dp[0] = a[0];
        dp[1] = a[0]+a[1];

        for(int i=2; i<5; i++){
            dp[i] = dp[i-1] + a[i];
        }

        int q;
        System.out.println("enter the query");
        q=sc.nextInt();
        for(int i=0; i<=q; i++){
            System.out.println("Enter the index");
            int index = sc.nextInt();
            System.out.println(dp[index]);
            System.out.println();
        }
        sc.close();
    }
}