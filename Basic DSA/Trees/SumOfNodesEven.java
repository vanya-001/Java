package Trees;

public class SumOfNodesEven {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Bt {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static int sum = 0;

    public static void sumOfNodes(Node root) {
        if (root == null) {
            return;
        }

        if (root.data % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) {
                    sum += root.left.left.data;
                }
                if (root.left.right != null) {
                    sum += root.left.right.data;
                }
            }
            if (root.right != null) {
                if (root.right.left != null) {
                    sum += root.right.left.data;
                }
                if (root.right.right != null) {
                    sum += root.right.right.data;
                }
            }
        }

        sumOfNodes(root.left);
        sumOfNodes(root.right);
    }

    public static int sumEvenGrandparent(Node root) {
        sumOfNodes(root);
        return sum;
    }
}
