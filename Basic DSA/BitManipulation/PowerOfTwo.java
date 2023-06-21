package BitManipulation;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos =2;
        int bitMask = number>>pos;

        if((bitMask & 1) !=0){
            System.out.println("Not a power of 2");
        }
        else{
            System.out.println("Is a power of 2");
        }
        sc.close();
    }
}
