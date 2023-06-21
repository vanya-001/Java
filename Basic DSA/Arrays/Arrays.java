package Arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // int marks[] = {98,97,95};

        // User defined
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int num[] = new int[n];
        // for(int i=0; i<n; i++){
        //     num[i]=sc.nextInt();
        // }
        
        // for(int i=0; i<n;i++){
        //     System.out.println(num[i]);
        // }

        // Take an array as input from the user. Search for a given number x and print the index at which it occurs; (Linear Search)
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int search = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            if(a[i]==search){
                System.out.println(i);
                return;
            }
        }
    }
}
