package lr3.Task3.Task8;
import java.util.Scanner;

public class MyList {
    Node head;

    public void createHead(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());
            node.next = head;
            head = node;
        }
    }

    public void createTail(int n) {
        Scanner sc = new Scanner(System.in);
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head;

        while (cur != null) {
            sb.append(cur.value).append(" ");
            cur = cur.next;
        }

        return sb.toString();
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node cur = head;
        for (int i = 0; i < index - 1 && cur != null; i++) {
            cur = cur.next;
        }

        if (cur != null) {
            Node node = new Node(value);
            node.next = cur.next;
            cur.next = node;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }

        cur.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node cur = head;
        for (int i = 0; i < index - 1 && cur != null; i++) {
            cur = cur.next;
        }

        if (cur != null && cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    public void createHeadRec(int n, Scanner sc) {
        if (n == 0) return;

        Node node = new Node(sc.nextInt());
        node.next = head;
        head = node;

        createHeadRec(n - 1, sc);
    }

    public Node createTailRec(int n, Scanner sc, Node tail) {
        if (n == 0) return head;

        Node node = new Node(sc.nextInt());

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        return createTailRec(n - 1, sc, tail);
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node == null) return "";
        return node.value + " " + toStringRec(node.next);
    }
}
