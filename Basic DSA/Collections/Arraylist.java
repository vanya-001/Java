package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        // Non-continous in memory
        // variable size
        // we can only store objects
        // memory is stored in the form of heap

        // 1. Add   2. Get  3. Modify   4. Delete/Remove    5. Iterate/Operations

        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // Add
        list.add(0);
        list.add(2);
        list.add(5);

        System.out.println(list);

        // Get
        int element = list.get(1);
        System.out.println(element);

        // Add element in between
        list.add(1,1);
        System.out.println(list);

        // set element 
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size of an array list
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
