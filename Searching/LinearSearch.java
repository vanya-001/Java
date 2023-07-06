import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements in array: ");
        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        for(int i=0; i<5; i++){
            if(a[i] == k){
                System.out.println("Element found!");
            }
        }
        sc.close();
    }
}
