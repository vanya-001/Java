package Trees;

public class CountOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class Bt{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Time Complexity - O(n)
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = count(root.left);
        int rightNode = count(root.right);
        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Bt tree = new Bt();
        Node root = tree.buildTree(nodes);

        System.out.println(count(root));
    }
}
