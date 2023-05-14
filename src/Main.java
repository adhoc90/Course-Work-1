
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(calculateMassive(arr)));
    }

    public static int[] calculateMassive(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
        }
        int[] elements = Arrays.copyOfRange(arr, 2, 7);
        return elements;
    }
}
