package lr3.Task6;
import java.util.*;

public class Bench {

    static void main(String[] args) {
        long n = 4_000_000;

        System.out.println("ArrayList add first: " + testArrayListAddFirst(n));
        System.out.println("ArrayList add middle: " + testArrayListAddMiddle(n));
        System.out.println("ArrayList add last: " + testArrayListAddLast(n));

        System.out.println("TreeSet add: " + testTreeSetAdd(n));

        System.out.println("LinkedHashMap put: " + testLinkedHashMapPut(n));

        System.out.println("ArrayList Remove First: " + testArrayListRemoveFirst(n));
        System.out.println("ArrayList Remove Middle: " + testArrayListRemoveMiddle(n));
        System.out.println("ArrayList Remove Last: " + testArrayListRemoveLast(n));

        System.out.println("testTree Set Remove: " + testTreeSetRemove(n));

        System.out.println("LinkedHashMap Remove: " + testLinkedHashMapRemove(n));
        System.out.println("LinkedHashMap Get: " + testLinkedHashMapGet(n));
    }

    static long testArrayListAddFirst(long n) {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testArrayListAddMiddle(long n) {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(list.size() / 2, i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testArrayListAddLast(long n) {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testTreeSetAdd(long n) {
        Set<Integer> set = new TreeSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testLinkedHashMapPut(long n) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.put(i, i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testArrayListRemoveFirst(long n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    static long testArrayListRemoveMiddle(long n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        return System.currentTimeMillis() - start;
    }

    static long testArrayListRemoveLast(long n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.removeLast();
        }
        return System.currentTimeMillis() - start;
    }

    static long testTreeSetRemove(long n) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.remove(i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testLinkedHashMapRemove(long n) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) map.put(i, i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.remove(i);
        }
        return System.currentTimeMillis() - start;
    }

    static long testLinkedHashMapGet(long n) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) map.put(i, i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.get(i);
        }
        return System.currentTimeMillis() - start;
    }
}