package Assignment_2;

import java.util.Stack;

public class StackExercises {

    // السؤال 1: ميثود لعكس نص (String) باستخدام (Stack)
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // تحويل النص إلى حروف ووضع كل حرف داخل (Stack)
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // سحب الحروف من (Stack) (ستخرج بالعكس لأن الستيك Last-In-First-Out)
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // السؤال 2: ميثود لترتيب عناصر الستيك باستخدام ستيك آخر فقط
    public static void sortStack(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty()) {
            // سحب العنصر الحالي من الستيك الأول
            int temp = s1.pop();

            // مقارنة العنصر مع الستيك الثاني لضمان الترتيب
            while (!s2.isEmpty() && s2.peek() > temp) {
                s1.push(s2.pop());
            }
            s2.push(temp);
        }

        // إعادة العناصر مرتبة إلى الستيك الأصلي (s1)
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
}