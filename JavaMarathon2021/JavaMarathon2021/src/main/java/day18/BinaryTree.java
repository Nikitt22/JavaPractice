package day18;

public class BinaryTree {
   public static Node root;

    public Node buildingTree(int value, Node current){
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.leftChild = buildingTree(value, current.leftChild);
        } else if (value > current.value) {
            current.rightChild = buildingTree(value, current.rightChild);
        } else {
            return current;
        }

        return current;
    }
    public void add(int value) {
        root = buildingTree(value, root);
    }
    public  BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(20);
        bt.add(14);
        bt.add(23);
        bt.add(11);
        bt.add(16);
        bt.add(22);
        bt.add(27);
        bt.add(5);
        bt.add(15);
        bt.add(18);
        bt.add(24);
        bt.add(150);
        bt.add(8);

        return bt;
    }
}
