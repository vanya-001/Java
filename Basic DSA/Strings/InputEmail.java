package Strings;
import java.util.Scanner;
public class InputEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your username: ");
        // String name = sc.nextLine();
        // String email = name + "@gmail.com";
        // System.out.println("Email = " +email); 

        // Taking out username from the email id
        System.out.println("Enter your email id: ");
        String email = sc.nextLine();
        String username =" ";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
        sc.close();
    }
}
