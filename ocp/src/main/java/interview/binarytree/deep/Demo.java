package interview.binarytree.deep;

public class Demo {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        FindDeep findDeep = new FindDeep();
        System.out.println(findDeep.findDeep(root));
    }
}
