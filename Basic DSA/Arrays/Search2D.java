package Arrays;
import java.util.Scanner;
public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        System.out.println("Enter col: ");
        int col = sc.nextInt();

        int[][] numbers = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the number to be searched");
        int search =sc.nextInt();
        sc.close();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j] == search){
                    System.out.println("It is found at: numbers[" +i+ "] ["+j+"]");
                    return;
                }
            }
        }
    }
}
