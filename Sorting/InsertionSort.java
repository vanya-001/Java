public class InsertionSort {
    public static void insertion(int[] a){
        for(int i=1; i<a.length; i++){
            int curr = a[i];
            int j= i-1;
            while(j>=0 && curr < a[j]){
                a[j+1] = a[j];
                j--;
            }

            // placement
            a[j+1] = curr;
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {7,8,3,1,2};
        insertion(a);
    }
    
}
