package LinkedList;
// To detect the loop in linkedlist
public class FloydsAlgo {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
            this.next = null;
        }
    }
    // detect cycle
    public boolean hasCycle(Node head){

        if(head == null){
            return false;
        }

        Node hare = head; //fast
        Node turtle = head; //slow

        while(hare.next == null && hare.next !=null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    // Remove cycle

}
