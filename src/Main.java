import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayManager.createIntArray(10, 3);
        System.out.println(Arrays.toString(array));
        ArrayManager.removeArrayElementsByValue(array, 0);
    }
}
