package lr3.Task3.Task4;

public class Test { // ГЛАВНЫЙ КЛАСС
    static void main(String[] args) {
    Node nodeO = new Node(0, null);
    Node node1 = new Node( 1, null);
    Node node2 = new Node( 2, null);
    Node node3 = new Node(3, null);

    nodeO.next = node1;
    node1.next = node2;
    node2.next = node3;

    Node ref = nodeO; // для перемещения по слиску бостоточно помнить голову
    while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}