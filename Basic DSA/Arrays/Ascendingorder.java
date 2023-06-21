package Arrays;
// import java.util.Scanner;
public class Ascendingorder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of Array: ");
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0; i<n; i++){
        //     System.out.println("Enter the value to be stored at " +i);
        //     a[i] = sc.nextInt();
        // }
        int temp;
        int a[]={6,3,1,4,2};
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // sc.close();
    }
}
