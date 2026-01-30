package Assignment_1;

public class DoublyAssignment<E> {

    // تعريف العقدة المزدوجة
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> header; // عقدة البداية الوهمية
    private Node<E> trailer; // عقدة النهاية الوهمية
    private int size = 0;

    public DoublyAssignment() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
    }

    // السؤال 12: ميثود لحذف العناصر المكررة من القائمة المزدوجة
    public void q12_removeDuplicates() {
        if (size <= 1) return;
        Node<E> current = header.next;
        while (current != trailer) {
            Node<E> runner = current.next;
            while (runner != trailer) {
                if (current.data.equals(runner.data)) {
                    Node<E> duplicate = runner;
                    runner = runner.next;
                    // حذف العقدة المكررة بربط ما قبلها بما بعدها
                    duplicate.prev.next = duplicate.next;
                    duplicate.next.prev = duplicate.prev;
                    size--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // السؤال 13: طباعة القائمة المزدوجة بالعكس (من الذيل إلى الرأس)
    public void q13_printReverse() {
        Node<E> curr = trailer.prev; // نبدأ من العقدة الي قبل الذيل الوهمي
        System.out.print("Reverse List: ");
        while (curr != header) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    // السؤال 14: البحث عن عنصر في القائمة المزدوجة وإرجاع true إذا وجد
    public boolean q14_search(E target) {
        Node<E> curr = header.next;
        while (curr != trailer) {
            if (curr.data.equals(target)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}