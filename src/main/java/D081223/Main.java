package D081223;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {32, 88, 1, -5, 65, 76, 3, -8};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array) {
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
