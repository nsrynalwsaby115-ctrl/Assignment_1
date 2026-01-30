package Assignment_1;

public class SinglyAssignment<E> {

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head = null;
    private int size = 0;

    // السؤال 5: ميثود لدمج قائمتين مرتبتين مع بعضهما
    public void q5_concatenate(SinglyAssignment<E> other) {
        if (other.head == null) return;
        if (head == null) {
            head = other.head;
        } else {
            Node<E> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = other.head;
        }
        size += other.size;
    }

    // السؤال 6 و 7: تدوير القائمة لليمين بمقدار k
    public void q6_q7_rotate(int k) {
        if (head == null || k == 0 || size <= 1) return;
        k = k % size;
        if (k == 0) return;

        for (int j = 0; j < k; j++) {
            Node<E> prev = null;
            Node<E> curr = head;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            curr.next = head;
            head = curr;
            prev.next = null;
        }
    }

    // السؤال 8: البحث عن عنصر وإرجاع موقعه (Position)
    public int q8_findPosition(E target) {
        Node<E> curr = head;
        int pos = 1;
        while (curr != null) {
            if (curr.data.equals(target)) return pos;
            curr = curr.next;
            pos++;
        }
        return -1;
    }

    // السؤال 9 و 10: إيجاد الـ Index لعنصر معين وإرجاع -1 إذا لم يوجد
    public int q9_q10_findIndex(E target) {
        Node<E> curr = head;
        int index = 0;
        while (curr != null) {
            if (curr.data.equals(target)) return index;
            curr = curr.next;
            index++;
        }
        return -1;
    }

    // السؤال 11: حذف عقدة من موقع محدد (Specific Position)
    public void q11_removeAtPosition(int index) {
        if (index < 0 || index >= size || head == null) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }
}