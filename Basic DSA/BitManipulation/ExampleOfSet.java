package BitManipulation;

public class ExampleOfSet {
    public static void main(String[] args) {
        int n = 5;
        int pos=1;
        int bitMask = 1<<pos;
        int newn = bitMask | n;
        System.out.println(newn);
    }
}
