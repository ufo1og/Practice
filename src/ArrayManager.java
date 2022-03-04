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
}
