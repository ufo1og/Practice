import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
    private static final Random random = new Random();

    private static void fillArray(int maxValue, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
    }

    private static void fillArray(double maxValue, double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * maxValue;
        }
    }

    public static int[] createIntArray (int size, int maxValue) {
        int[] array = new int[size];
        fillArray(maxValue, array);
        return array;
    }


    public static double[] createDoubleArray (int size, double maxValue) {
        double[] array = new double[size];
        fillArray(maxValue, array);
        return array;
    }

    public static void swapElements (int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] += array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }

    public static void swapElements (double[] array, int firstIndex, int secondIndex) {
        array[firstIndex] += array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }

    public static void removeArrayElementsByValue (int[] array, int value) {
        int shift = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                shift++;
            } else {
                array[i - shift] = array[i];
            }
        }
        int[] resultArray = Arrays.copyOf(array, array.length - shift);
        System.out.println(Arrays.toString(resultArray));
    }
}
