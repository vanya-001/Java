package BinarySearchTrees;

public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildNode(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = buildNode(root.left, val);
        }
        else{
            root.right = buildNode(root.right, val);
        }

        return root;
    }

    public static void print(Node root , int x, int y){
        if(root == null){
            return;
        }

        if(root.data>=x && root.data<=y){
            print(root.left, x,y);
            System.out.print(root.data + " ");
            print(root.right, x, y);
        }
        else if( root.data >= y){
            print(root.left, x, y);
        }
        else{
            print(root.right, x,y);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,7,10,11,14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root= buildNode(root, nodes[i]);
        }

        print(root, 6,10);
    }
}
