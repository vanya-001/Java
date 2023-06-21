package Arrays;
import java.util.Scanner;
public class Transpose2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row =sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose: ");
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
