package BinarySearchTrees;

public class SearchInBST {
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

        if(root.data>val){
            // left subtree
            root.left = buildNode(root.left, val);
        }
        else{
            // right subtree
            root.right = buildNode(root.right, val);
        }

        return root;
    }

    // Time complexity -  O(H) , H-Height
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            // left subtree
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else{
            return search(root.right , key);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,10,3,6,1,4,11,14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = buildNode(root, nodes[i]);
        }

        if(search(root, 7)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
