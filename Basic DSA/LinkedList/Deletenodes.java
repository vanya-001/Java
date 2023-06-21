package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Deletenodes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int element = sc.nextInt();
            list.add(element);
        }
        sc.close();
        System.out.println(list);
        for(int i=0; i<num; i++){
            int element = list.get(i);
            if(element > 25){
                list.remove(i);
                continue;
            }
        }
        System.out.println(list);
    }
}
