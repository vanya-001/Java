package BitManipulation;

import java.util.Scanner;

public class ExampleOfUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // update bit to 1 else update to 0
        // oper = 1 => set 
        // oper = 0 => clear
        int n=5;
        int pos =1;
        int bitMask = 1<<pos;
         
        if(oper == 1){
            // set
            int new1 = bitMask | n;
            System.out.println(new1);
        }
        else{
            // clear
            int newBitMask1 = ~(bitMask);
            int new2 = newBitMask1 & n;
            System.out.println(new2);
        }
        sc.close();
    }
}
