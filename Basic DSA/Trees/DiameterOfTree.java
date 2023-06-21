package Trees;

public class DiameterOfTree {
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
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    // Time complexity - O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // Time Complexity - O(n)

    static class TreeInfo{
        int ht;
        int dia;

        TreeInfo(int ht, int dia){
            this.ht= ht;
            this.dia = dia;
        }
    }
    public static TreeInfo diameterApproach2(Node root){
        if(root==null)
        {
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameterApproach2(root.left);
        TreeInfo right = diameterApproach2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.dia;
        int diam2 = right.dia;
        int diam3 = left.ht + right.ht + 1;
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes);

        System.out.println(diameterApproach2(root).dia);
    }
}
