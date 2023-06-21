// import java.util.Scanner;
// public class SpiralOrder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // We are given a 2D matrix of n X m
//         // We will need 4 variables:
//         // a. row_start - initialized with 0.
//         // b. row_end - initialized with n-1.
//         // c. column_start - initialized with 0.
//         // d. column_end - initialized with m-1.

//         int n =sc.nextInt(); //Number of rows
//         int m =sc.nextInt(); //number of columns
//         int matrix[][]=new int[n][m];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] =sc.nextInt();
//             }
//         }
//         sc.close();
//         System.out.println("The Spiral Order Matrix: ");
//         // First of all, we will traverse in the row row_start from column_start to column_end and we will increase the row_start with 1 as we have traversed the starting row.

//         int row_start = 0;
//         int col_start = 0;
//         int row_end = n-1;
//         int col_end = m-1;

//         while(row_start <= row_end && col_start <= col_end){

//             for(int col=col_start; col<=col_end; col++){
//                 System.out.print(matrix[row_start][col] + " ");
//             }
//             row_start++;

//             for(int row=row_start; row<=row_end; row++){
//                 System.out.print(matrix[row][col_end] + " ");
//             }
//             col_end--;

//             for(int col=col_end; col>=col_start; col--){
//                 System.out.println(matrix[row_end][col] + " ");
//             }
//             row_end--;

//             for(int row=row_end; row>=row_start;row++){
//                 System.out.println(matrix[row][col_start] + " ");
//             }
//             col_start++;
//             System.out.println();
//         }
//     }
// }



// NEW
