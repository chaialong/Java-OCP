package interview.binarytree.deep;

public class FindDeep {
    public int findDeep(Node root) {
        int deep = 0;
        if (root != null) {
            int leftMax = findDeep(root.left);
            int rightMax = findDeep(root.right);
            deep = leftMax >= rightMax ? leftMax + 1 : rightMax + 1;
        }

        return deep;
    }
}
