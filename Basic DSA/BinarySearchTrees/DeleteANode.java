package BinarySearchTrees;

public class DeleteANode {
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

    public static Node BuildNode(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = BuildNode(root.left, val);
        }
        else{
            root.right = BuildNode(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root , int val){
        if(root.data > val){
           root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            // root.data == val
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,7,10,11,14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = BuildNode(root, nodes[i]);
        }

        inorder(root);
        System.out.println();

        delete(root,4);
        inorder(root);

        System.out.println();
        
        delete(root,10);
        inorder(root);
    }
}
