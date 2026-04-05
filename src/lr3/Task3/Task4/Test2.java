package lr3.Task3.Task4;

public class Test2 {
    static void main (String[] args) {
    // добавление элементов с перемещением головы (наращивание с головы)
        Node head = null;
    // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
    // вывод элементов но экран
            Node ref = head;
            while (ref != null) {
                System.out.println(" " + ref.value);
                ref = ref.next;
            }
        }
    }
}