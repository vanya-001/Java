package LinkedList;

public class Palindrome {
     Node head;

    class Node{
        int val; 
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node reverseIterate(Node head){

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while(hare.next !=null && hare.next.next !=null){
            hare =hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(Node head){
        if(head==null || head.next == null){
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHalfStart = reverseIterate(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart !=null){
            if(firstHalfStart.val!=secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
}
