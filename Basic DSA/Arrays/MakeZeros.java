package Arrays;
public class MakeZeros {

    // In whole matrix when you find a 0, convert its upper,lower,left and right value to zero and make that element the sum of upper lower left and right value.

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                        {5,6,0,7},
                        {8,9,4,6},
                        {8,4,5,2}};
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] temp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                temp[i][j]=matrix[i][j];
            }
        }
        int sum=0;
 
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(temp[i][j]==0){
                    if(i+1 < n){
                        sum += temp[i+1][j];
                        matrix[i+1][j] = 0;
                    }
                    if(i-1 >=0){
                        sum += temp[i-1][j];
                        matrix[i-1][j] = 0;
                    }
                    if(j+1 < m){
                        sum += temp[i][j+1];
                        matrix[i][j+1] = 0;
                    }
                    if(j-1 >=0){
                        sum += temp[i][j-1];
                        matrix[i][j-1] = 0;
                    }
                    matrix[i][j] =sum;
                    
                }
                sum=0;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
