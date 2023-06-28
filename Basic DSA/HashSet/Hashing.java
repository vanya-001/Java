package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size
        System.out.println("Size of the set is: " + set.size());

        // search - contains
        if(set.contains(1)){
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contain 6");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not contain 1");
        }

        // To print all elements
        System.out.println(set); 
        
        // Iterator -  to traverse through all the elements in set
        Iterator it = set.iterator();
        // Two functions:- 
        // 1. hasNext() => true/false
        // 2. next() => next value
        while(it.hasNext()){
            System.out.println(it.next());
        }     
    }
}