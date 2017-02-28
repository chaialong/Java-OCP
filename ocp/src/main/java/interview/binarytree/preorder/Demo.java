package interview.binarytree.preorder;

public class Demo {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        PreOrder preOrder = new PreOrder();
        preOrder.preOrderList(root);
        System.out.println();
        MidOrder midOrder = new MidOrder();
        midOrder.midOrderList(root);
        System.out.println();
        NextOrder nextOrder = new NextOrder();
        nextOrder.nextOrderList(root);
    }
}
