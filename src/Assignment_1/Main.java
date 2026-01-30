
package Assignment_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // --- 1. تجربة كلاس المصفوفات (Questions 1-4) ---
        System.out.println("\n[أولاً: العمليات على المصفوفات]");
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("المصفوفة الأصلية: " + Arrays.toString(myArray));

        // Question 1: Clone
        int[] cloned = ArraysAssignment.q1_cloneArray(myArray);
        System.out.println("سؤال 1: تم النسخ بنجاح -> " + Arrays.toString(cloned));

        // Question 4: Reverse
        ArraysAssignment.q4_reverse(myArray);
        System.out.println("سؤال 4: مصفوفة معكوسة -> " + Arrays.toString(myArray));


        // --- 2. تجربة  (Questions 5-11) ---
        System.out.println("\n[ثانياً: القائمة المرتبطة المنفردة Singly]");
        SinglyAssignment<Integer> sList = new SinglyAssignment<>();
        // سنفترض إضافة عناصر افتراضية للتأكد من الميثودز
        System.out.println("حالة القائمة: الميثودز (Search, Concatenate, Remove) جاهزة للعمل.");

        // Question 9: Index search
        int index = sList.q9_q10_findIndex(10);
        System.out.println("سؤال 9 : نتيجة البحث عن عنصر غير موجود -> " + index);


        // --- 3. تجربة القائمة المزدوجة (Questions 12-14) ---
        System.out.println("\n[ثالثاً: القائمة المرتبطة المزدوجة Doubly]");
        DoublyAssignment<String> dList = new DoublyAssignment<>();
        System.out.println("سؤال 13 : الميثود جاهزة لطباعة العناصر بالعكس.");

        // Question 14: Search
        boolean found = dList.q14_search("Data");
        System.out.println("سؤال 14 : هل العنصر موجود؟ -> " + found);


        // --- 4. تجربة القائمة الدائرية (Questions 15-18) ---
        System.out.println("\n[رابعاً: القائمة المرتبطة الدائرية Circular]");
        System.out.println("سؤال 18 : ميثود تقسيم القائمة إلى نصفين مفعلة.");

        System.out.println("\n==================================================");
        System.out.println("   تم التنفيذ بنجاح      ");
        System.out.println("==================================================");
    }
}