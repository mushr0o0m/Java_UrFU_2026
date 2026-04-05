package lr3.Task3.Task7;

public class Demo {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};

        Node head1 = createHead(data);

        Node head2 = createTail(data);

        System.out.print("Head: ");
        print(head1);

        System.out.print("\nTail: ");
        print(head2);
    }

    public static Node createHead(int[] arr) {
        Node head = null;

        for (int val : arr) {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }

        return head;
    }

    public static Node createTail(int[] arr) {
        Node head = null;
        Node tail = null;

        for (int val : arr) {
            Node node = new Node(val);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }

    public static void print(Node head) {
        Node cur = head;

        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }
}