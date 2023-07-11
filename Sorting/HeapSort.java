public class HeapSort {
    public static void heapSort(int[] a){
        int n = a.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(a, n, i);
        }

        // swapping the elements and heapify again
        for(int i=n-1; i>=0; i--){
            // swap
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
    }

    public static void heapify(int[] a, int n, int i){
        int large = i; //parent node index position
        int li = 2*i+1; //left child node
        int ri = 2*i+2; //right child node

        if(li < n && a[li] > a[large]){
            large = li;
        }

        if(ri < n && a[ri] > a[large]){
            large = ri;
        }

        if(large != i){
            // swap
            int temp = a[i];
            a[i] = a[large];
            a[large] = temp;

            heapify(a,n,large);
        }
    }

    public static void main(String[] args) {
        int[] a={22,13,17,11,10,14,12};

        heapSort(a);

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
