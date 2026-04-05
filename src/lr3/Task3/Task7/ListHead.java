package lr3.Task3.Task7;

public class ListHead {
    public static Node createHead(int[] values) {
        Node head = null;

        for (int val : values) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}
