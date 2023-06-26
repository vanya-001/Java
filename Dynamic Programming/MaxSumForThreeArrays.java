
public class MaxSumForThreeArrays {
    // Finf the sum of subsets where 3 arrays are given and you cannot take adjacents
    public static void main(String[] args) {
        int[] a = {10,40,70};
        int[] b = {20,50,80};
        int[] c = {30,60,90};

        int[] dpa = new int[3];
        int[] dpb = new int[3];
        int[] dpc = new int[3];

        dpa[0] = a[0];
        dpb[0] = b[0];
        dpc[0] = c[0];

    for(int i=1; i<3; i++){
        dpa[i] = a[i] + Math.max(dpb[i-1], dpc[i-1]);
        dpb[i] = b[i] + Math.max(dpa[i-1], dpc[i-1]);
        dpc[i] = c[i] + Math.max(dpa[i-1], dpb[i-1]);
    } 
    
    System.out.println(dpa[2] +" "+ dpb[2] + " "+ dpc[2]);
    System.out.println(Math.max(dpa[2], Math.max(dpb[2], dpc[2])));
    }
}
