import java.util.*;

public class BinarySeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements in sorted form");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched!");
        int k = sc.nextInt();
        int low = 0;
        int high = n-1;
        int mid = (low+high) / 2;
        while (low <= high) {
            
            if(a[mid] == k){
                System.out.println("Element found at => " + mid);
                break;
            }
            else if(k>a[mid]){
                low = mid + 1;
            }
            else if( k<a[mid]){
                high = mid - 1;
            }
            mid = (low+high)/2;
        }

        sc.close();

    }
}
