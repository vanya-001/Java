package Stacks;
import java.util.*;
public class TwoStacksInArray {
    static int[] arr;
    static int size;
    static int top1, top2;

    TwoStacksInArray(int n){
        this.size = n;
        arr=new int[n];
        top1 = n/2 + 1;
        top2 = n/2;
    }

    // For stack 1
    public static void push1(int n){
        if(top1 > 0){
            top1--;
            arr[top1] =n ;
        }
        else{
            System.out.println("Stack Overflow");
            return;
        }
    }

    // For stack 2
    public static void push2(int n){
        if(top1<size-1){
            top2++;
            arr[top2] = n;
        }
        else{
            System.out.println("Stack Overflow");
            return;
        }
    }

    // pop for stack 1
    public static int pop1(){
        if(top1<= size/2){
            int x = arr[top1];
            top1++;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    // POP for Stcak 2
    public static int pop2(){
        if(top2>=size/2 +1){
            int x = arr[top2];
            top2--;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 1;
    }
    public static void main(String[] args) {
        TwoStacksInArray t = new TwoStacksInArray(5);
        t.push1(1);
        t.push2(2);
        t.push2(3);
        t.push1(4);
        t.push2(67);
        System.out.println(t.pop1());
        t.push2(40);
        System.out.println(t.pop2());
    }
}
    

