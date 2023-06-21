package BitManipulation;
import java.util.Scanner;
public class CountOneandZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count =0, count0 =0;
        while(n > 0){
            
            count += n&1;
            n >>= 1;
        }
        System.out.println("1's: " +count);
        while(n!=0){
            count0 += (~n)&1;
            n>>=1;
        }
        System.out.println("0's: " +count0);
        sc.close();
    }
}
