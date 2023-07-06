import java.util.*;

public class BubbleSort {
    public static void bubble(int[] a, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Array after sorting");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        bubble(a, n);
        sc.close();
    }
}
