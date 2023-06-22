package BinarySearchTrees;
import java.util.*;
public class RootToLeafPaths {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+ " ->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        // leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{ //non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        
        path.remove(path.size()-1);    
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,6,3,1,4,10,11,14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = buildNode(root, nodes[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());
    }
}
