import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int z = 0;
        int i = 0;
        this.numbers = new ArrayList<Integer>();
        while (i < 7) {
            z = this.random.nextInt(39) + 1;
            if (!containsNumber(z)) {
                this.numbers.add(z);
                i++;
    }
        }
    }
    public boolean containsNumber(int number) {
         return numbers.contains(number);
    }
}
//The numbers of the week consist of 7 different numbers between 1 and 39