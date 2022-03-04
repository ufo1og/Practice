import java.util.Arrays;

public class BubbleSort {
    private static final int size = 20;
    private static final int maxValue = 50;

    public static void sortArray() {
        int[] array = ArrayManager.createIntArray(size, maxValue);
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    needIteration = true;
                    ArrayManager.swapElements(array, i, i - 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
