import java.util.ArrayList;
import java.util.Random;

public class WeightedRandomizer {
    private int[] numbers;
    private int[] weights;

    public WeightedRandomizer(int arraySize, int maxValue) {
        this.numbers = ArrayManager.createIntArray(arraySize, maxValue);
        this.weights = ArrayManager.createIntArray(arraySize, maxValue);
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int[] getWeights() {
        return weights;
    }

    public int getRandomNumberByWeight () {
        ArrayList<Integer> numbersByWeights = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                numbersByWeights.add(numbers[i]);
            }
        }
        return numbersByWeights.get(random.nextInt(numbersByWeights.size()));
    }
}
