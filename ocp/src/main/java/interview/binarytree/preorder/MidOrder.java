package interview.binarytree.preorder;

public class MidOrder {
    public void midOrderList(Node root){
        System.out.print(root.value + " ");
        if (root.left != null) {
            midOrderList(root.left);
        }
        if (root.right != null) {
            midOrderList(root.right);
        }
    }
}
