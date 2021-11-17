import java.io.*;

public class BinaryTree {

    public static Node n0, n1, n2, n3, n4;

    public static class Node {
        private int data;
        private Node left, right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public static int getNodeCount(Node node) {
            int count = 0;
            if(node != null) {
                count = 1 + getNodeCount(node.getLeft()) + getNodeCount(node.getRight());
            }
            return count;
        }

        public static int getHeight(Node node) {
            int count = 0;
            if(node != null) {
                count = 1 + Utils.max(getHeight(node.getLeft()) , getHeight(node.getRight()));
            }
            return count;
        }

        public static int getLeafCount(Node node) {
            int count = 0;
            if(node != null && node.getLeft() != null && node.getRight() != null) {
                count = getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
            }
            else {
                return 1;
            }
            return count;
        }

        public static int getNoLeafCount(Node node) {
            int count = 0;
            if(node == null) {
                return 0;
            }
            else if(node.getLeft() == null && node.getRight() == null) {
                return 0;
            }
            else {
                count = 1 + (Node.getNoLeafCount(node.getLeft()) + Node.getNoLeafCount(node.getRight()));
            }
            return count;
        }

        public static int getLowestValue(Node node) {
            int lowestValue = 0;
            if(node == null) {
                return 99999;
            }
            else {
                int left = getLowestValue(node.getLeft());
                int right = getLowestValue(node.getRight());
                lowestValue = left < right ? left : right;
            }

            if(lowestValue > node.getData()) {
                return node.getData();
            }
            return lowestValue;
        }
    }

    public static class Utils {
        public static int max(int a, int b) {
            return a > b ? a : b;
        }
    }

    private static void nodeInit() {
        n4 = new Node(5, null, null);
        n3 = new Node(4, null, null);
        n2 = new Node(3, null, null);
        n1 = new Node(2, n3, n4);
        n0 = new Node(1, n1, n2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        nodeInit();
        int count = Node.getNodeCount(n0);
        bw.write("The number of n0's children : " + count + "\n");
        int height = Node.getHeight(n0);
        bw.write("The number of n0's height : " + height + "\n");
        int leaf = Node.getLeafCount(n0);
        bw.write("The number of n0's leaf node : " + leaf + "\n");
        int nLeaf = Node.getNoLeafCount(n0);
        bw.write("The number of n0's no leaf node : " + nLeaf + "\n");
        int lowest = Node.getLowestValue(n0);
        bw.write("The number of n0's lowest data value : " + lowest + "\n");



        bw.flush();
        br.close();
        bw.close();
    }
}
