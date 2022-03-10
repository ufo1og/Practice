import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
    private static final Random random = new Random();

    private static void fillArray(int maxValue, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue + 1);
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
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void swapElements (double[] array, int firstIndex, int secondIndex) {
        double temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
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

    public static void quickSortThreeRanges (int[] a, int l, int r) {
        if ((r - l) <= 0) return;
        int i = l;
        int j = r;
        int p = (l + r) / 2;
        int q = p;
        int v = a[p];
        while (i <= j) {
            while (a[i] < v) {
                i++;
            }

            while (a[j] > v) {
                j--;
            }
            if (i >= p && j <= q) break;
            swapElements(a, i, j);
            if (a[i] == v) {
                if (i >= p) {
                    if (a[i] != a[p]) swapElements(a, i, p = i + 1);
                }
                else swapElements(a, i, --p);
            }
            if (a[j] == v) {
                if (j <= q)  {
                    if (a[i] != a[p]) swapElements(a, j, q = j - 1);
                }
                else swapElements(a, j, ++q);
            }
        }
        p = Integer.max(i, p) - 1;
        q = Integer.min(j, q) + 1;
        quickSortThreeRanges(a, l, p );
        quickSortThreeRanges(a, q, r);
    }

    public static void quickSort (int[] a, int l, int r) {
        if ((r - l) < 1) return;
        int i = l;
        int j = r;
        int v = a[(l + r) / 2];
        while (i <= j) {
            while(a[i] < v) i++;
            while(a[j] > v) j--;
            if (i >= j) break;
            swapElements(a, i++, j--);
        }
        //System.out.println(i + " " + j);
        if (i == j) quickSort(a, i + 1, r);
        else quickSort(a, i, r);
        quickSort(a, l, j);
    }

}
