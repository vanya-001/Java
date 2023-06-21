package Trees;

public class HeightOfTree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BT{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]== -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Time Complexity - O(n)
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int myHeight =Math.max(leftHeight, rightHeight) +1;
        return myHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes);

        System.out.println(Height(root));
    }
}
