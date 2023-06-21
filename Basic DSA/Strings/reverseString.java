package Strings;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        // for(int i=0; i<sb.length()/2; i++){
        //     int front =i;
        //     int back = sb.length() -1 -i; //5-1-0 => 4
        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);
        // }

        StringBuilder a = new StringBuilder("");
        for(int i=sb.length()-1; i>=0; i--){
            a.append(sb.charAt(i));
        }
        System.out.println(a);
    }
}
