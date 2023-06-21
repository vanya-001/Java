package BitManipulation;

import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int pos = sc.nextInt();

        int bitMAsk = 1<<pos;
        int newnum = bitMAsk ^ num;
        System.out.println(newnum);
        sc.close();
    }
}
