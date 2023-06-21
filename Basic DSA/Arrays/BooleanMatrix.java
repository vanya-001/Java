// package Arrays;
// import java.util.Vector;

// public class BooleanMatrix {
//     // public static void main(String[] args) {
//     //     int matrix[][] = {{1,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,0}};
        
//     //     // vector<int> temp =matrix; 
//     //     for(int i=0;i<=3;i++){
//     //         for(int j=0; j<=3; j++){
//     //             if(temp[i][j] ==1 ){
//     //                 for(int k=0;k<=3;k++){
//     //                     matrix[k][j]=1;
//     //                 }
//     //                 for(int k=0;k<=3;k++){
//     //                     matrix[i][k]=1;
//     //                 }
//     //             }
//     //         }
//     //     }

//     //     for(int i=0; i<=3;i++){
//     //         for(int j=0; j<=3; j++){
//     //             System.out.print(matrix[i][j]);
//     //         }
//     //         System.out.println();
//     //     }
//     // }

//         // Function for boolean matrix
//         public void function(Vector<Vector<Integer> > &matrix){
//             int r=matrix.size();
//             int c=matrix[0].size();
//             Vector<Vector<<Integer>> temp= matrix;

//             for(int i=0;i<r;i++){
//                 for(int j=0; j<c; j++){
//                     if(temp[i][j]==1){
//                         for(int k=0; k<r; k++){
//                             matrix[k][j]=1;
//                         }
//                         for(int k=0; k<c; k++){
//                             matrix[i][k]=1;
//                         }
//                     }
//                 }
//             }
//         }

//         public void Solution2(Vector<Vector<Integer> > &matrix) {
//             int r=matrix.size();
//             int c=matrix[0].size();
//             Vector<Integer> row(r,0);
//             Vector<Integer> col(c,0);

//             for(int i=0; i<r;i++){
//                 for(int j=0; j<c;j++){
//                     if(matrix[i][j] ==1){
//                         row[i]=1;
//                         col[j]=1;
//                     }
//                 }
//             }
//             for(int i=0; i<r;i++){
//                 for(int j=0; j<c;j++){
//                     if(row[i]==1 || col[j]==1){
//                         matrix[i][j]=1;
//                     }
//                 }
//             }
//         }

// }
