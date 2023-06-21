package LinkedList;
// find nth node and delete nth node
public class findNnodeFromLast {
    ListNode head;
    int size=0;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNode(ListNode head, int n){
        if(head==null || head.next == null){
            return null;
        }
        int size=0;
        ListNode curr =head;
        while(curr!= null){
            curr =curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int search = size-n;
        ListNode prev=head;
        int i=0;
        while(i<search){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
