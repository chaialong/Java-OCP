package interview.AntFinancial;

public class NodeReverse {
    public Node reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node pre = head;
        Node cur = head.getNext();
        Node next;

        while (cur != null) {
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }

        head.setNext(null);
        head = pre;

        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node("a");
        Node n2 = new Node("b");
        Node n3 = new Node("c");

        n1.setNext(n2);
        n2.setNext(n3);

        Node head = n1;

        NodeReverse reverse = new NodeReverse();
        reverse.print(head);
        head = reverse.reverse(head);
        reverse.print(head);
    }

    private void print(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }
    }


}
