
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int i = 1;
        int guess;
        
        while (true){
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            
            if (guess != numberDrawn){
                String totalGuess = ("Guess Made: " + i);
                if (guess < numberDrawn){
                    System.out.println("The numeber is greater, " + totalGuess);
                } else {
                    System.out.println("The number is lesser, " + totalGuess);
            }
                i++;
            } else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
