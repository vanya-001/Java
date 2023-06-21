package Strings;

import java.util.*;
// import java.lang.StringBuilder;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Vanya");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // inserting a char
        sb.insert(4,'S');
        System.out.println(sb);

        // delete
        sb.delete(4,5);
        System.out.println(sb);

        // append
        sb.append("e");
        sb.append("l");
        System.out.println(sb);

        sc.close();        
    }
}
