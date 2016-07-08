import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String characters= "abcdefghijklmnopqrstuvwxyz";
        String randomized = "";
        while (i < this.length) {
            randomized = randomized + characters.charAt(this.random.nextInt(26));
            i++;
        }
        return randomized;
    }
}
//int number = 17;
//char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);