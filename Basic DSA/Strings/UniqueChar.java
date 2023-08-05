package Strings;

public class UniqueChar {
    static final int noOfChar = 256;
    static char count[] = new char[noOfChar];

    public static int firstUnique(String str, int index) {
        if (index == str.length()) {
            return 0;
        }

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "aabdcedca";
        int index = firstUnique(str, -1);

        if (index == -1) {
            System.out.println("No unique character");
        } else {
            System.out.println(str.charAt(index) + " is the first unique element in the string");
        }
    }
}
