package Arrays;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element to be inputted at: " +i);
            a[i]=sc.nextInt();
        }
        int min, max;
        // We can also use Integer.MAX_VALUE or Integer.MIN_VALUE instead of assigning manually.
        min=max=a[0];
        for(int i=0; i<n; i++){
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println("Minimum: " + min + " MAximum: " + max);
        sc.close();
    }
}
