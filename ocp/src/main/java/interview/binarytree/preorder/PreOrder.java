package interview.binarytree.preorder;

public class PreOrder {
    public void preOrderList(Node node) {
        if (node.left != null) {
            preOrderList(node.left);
        }
        System.out.print(node.value + ", ");
        if (node.right != null) {
            preOrderList(node.right);
        }
    }
}
