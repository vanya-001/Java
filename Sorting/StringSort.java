public class StringSort {
    public static void main(String[] args) {
        String[] a = {"vanya", "aman", "yash", "snigdha", "agam", "vasundhra"};

        // Bubble Sort
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j].compareTo(a[j
                +1]) > 0){
                    // swap
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println(); 

        // Selection sort
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            // swap
            String temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
