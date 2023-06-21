package LinkedList;

import java.util.LinkedList;

public class SearchNo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer> ();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element =7;
        int index = -1;

        for(int i=0; i<list.size(); i++){
            int currElement = list.get(i);

            if(currElement == element){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at: " + index);
        }
    }
}