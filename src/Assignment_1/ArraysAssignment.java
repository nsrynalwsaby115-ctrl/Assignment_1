package Assignment_1;
import java.util.Arrays;
import java.util.Random;

public class ArraysAssignment {
    // السؤال 1:نسخ مصفوفة
    public static int[] q1_cloneArray(int[] original) {
        return original.clone();
    }

    // السؤال 2:حذف عنصر عشوائي من المصفوفة
    public static int[] q2_removeRandom(int[] arr) {
        if (arr.length == 0) return arr;
        int index = new Random().nextInt(arr.length);
        int[] result = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) continue;
            result[k++] = arr[i];
        }
        return result;
    }

    // السؤال 3:حذف عنصر محدد من المصفوفة
    public static int[] q3_removeSpecific(int[] arr, int target) {
        return Arrays.stream(arr).filter(val -> val != target).toArray();
    }

    // السؤال 4:عكس عناصر المصفوفة
    public static void q4_reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}