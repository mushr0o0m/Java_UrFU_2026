package lr3.Task3.Task7;

public class ListTail {
    public static Node createTail(int[] values) {
        Node head = null;
        Node tail = null;

        for (int val : values) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }
}
