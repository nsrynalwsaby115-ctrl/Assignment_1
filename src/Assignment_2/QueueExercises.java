package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

public class QueueExercises {

    // السؤال 3: ميثود لعكس ترتيب العناصر داخل  (Queue)
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // نقل العناصر من الطابور إلى الستيك لعكسها
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // إعادة العناصر من الستيك إلى الطابور بالترتيب المعكوس
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // السؤال 4: تطبيق طابور الأولويات (يخرج العنصر الأصغر أولاً)
    public static void priorityQueueExample() {
        // ترتب العناصر تلقائياً بحيث يخرج الأصغر أولاً
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        // عند استخدام pq.poll() سيخرج الرقم 5 أولاً
    }

    // السؤال 5: دمج طابورين مرتبين في طابور واحد كبير ومرتب
    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();

        // المقارنة بين العناصر في الطابورين وإضافة الأصغر للطابور الجديد
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.add(q1.remove());
            } else {
                merged.add(q2.remove());
            }
        }

        // إضافة أي عناصر متبقية في الطابور الأول أو الثاني
        while (!q1.isEmpty()) merged.add(q1.remove());
        while (!q2.isEmpty()) merged.add(q2.remove());

        return merged;
    }
}