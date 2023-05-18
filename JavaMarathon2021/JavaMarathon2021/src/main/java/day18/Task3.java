package day18;

public class Task3 {
    Node root = new Node(20);
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        dfs(BinaryTree.root);

    }
    public static void dfs(Node node) {
        if (node == null) {
            return;}
            dfs(node.leftChild);
        System.out.print(" " + node.value);
            dfs(node.rightChild);

    }
}