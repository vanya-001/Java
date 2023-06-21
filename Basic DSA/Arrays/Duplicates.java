package Arrays;
public class Duplicates {
    public static void main(String[] args) {
        int[] a ={2,3,1,4,2,3,6};
        // int[] temp= new int[7];
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]+" is repeated at "+i+" in the array");
                }
            }
        }
    }
}
