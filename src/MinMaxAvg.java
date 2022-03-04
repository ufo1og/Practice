import java.util.Arrays;

public class MinMaxAvg {
    private static final int maxValue = 1;
    private static final int arraySize = 10;

    public static void findMinMaxAvg () {
        double[] array = ArrayManager.createDoubleArray(arraySize, maxValue);
        double minValue = maxValue;
        double maxValue = 0;
        double avgValue = 0;
        System.out.println(Arrays.toString(array));
        for (double value : array) {
            minValue = Double.min(minValue, value);
            maxValue = Double.max(maxValue, value);
            avgValue += value / array.length;
        }
        System.out.println("Min, Max and Avg vlues are: " + minValue + " " + maxValue + " " + avgValue);
    }
}
