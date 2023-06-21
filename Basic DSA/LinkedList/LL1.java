package LinkedList;

public class LL1 {
    Node head;
    // size
    private int size;
    LL1(){
        this.size=0;
    }

    public int getSize(){
        return size;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add = first, last
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data){
         Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newnode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Delete - first, last

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();

        // add
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        // delete
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        // size
        System.out.println(list.getSize());
    }
}
