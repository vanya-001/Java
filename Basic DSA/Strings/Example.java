package Strings;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // declaration
        String name="Vanya";
        String fullName ="Vanya Maheshwari";
        System.out.println(name+fullName);

        // user defined
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //for only one word
        System.out.println("What is your name: "+ a);
        String b= sc.nextLine(); //for full line
        System.out.println("What is your name: "+ b);

        // Concatenation
        // means joining two strings
        String c = a+" "+b;

        //Length
        System.out.println(c.length());

        //charAt
        for(int i=0; i<c.length(); i++){
            System.out.println(c.charAt(i));
        }

        // compare
        String name1 ="Vanya";
        String name2 = "vanya";

        // Cases:-
        // 1. s1>s2 => +ve value
        // 2. s1==s2 => 0
        // 3. s1<s2 => -ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // == fails sometimes that is why compareTo is more feasible
        if(name1 == name2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // substring
        String name3 = c.substring(1,c.length());
        System.out.println(name3);
        sc.close();

        // Strings are immutable
    }
}
