import java.util.ArrayList;

public class PrimeNimbers {
    private static final int rangeStart = 2;
    private static final int rangeEnd = 100;

    private static boolean isPrime (int number) {
        for (int divider = 2; divider < number - 1; divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers () {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int number = rangeStart; number <= rangeEnd; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        System.out.println(primeNumbers);
    }

}
