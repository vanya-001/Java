package Arrays;
import java.util.Scanner;
public class SpiralOrder2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =4,c=4;
        // System.out.println("Enter number of rows and columns:");
        // r=sc.nextInt();
        // c=sc.nextInt();
        // columns
        int left=0;
        int right= c-1;
        // row
        int top=0;
        int bottom =r-1;
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int matrix[][] = new int[r][c];
        // for(int i=0; i<=r; i++){
        //     for(int j=0; j<=c; j++){
        //         System.out.print("Enter the number for "+i+ " " +j+ " ");
        //         matrix[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                System.out.println(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                System.out.println(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    System.out.println(matrix[i][left]);
                }
                left++;
            }
        }
        for(int i=0; i<=r; i++){
            for(int j=0; j<=c; j++){
                System.out.println(matrix[i][j]);
            }
        }
        sc.close();
    }
}