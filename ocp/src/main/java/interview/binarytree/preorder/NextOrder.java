package interview.binarytree.preorder;

public class NextOrder {
    public void nextOrderList(Node root) {
        if (root.left != null) {
            nextOrderList(root.left);
        }

        if (root.right != null) {
            nextOrderList(root.right);
        }

        System.out.println(root.value);
    }
}
