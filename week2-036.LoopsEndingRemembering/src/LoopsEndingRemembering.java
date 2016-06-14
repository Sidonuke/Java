import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number;
        int result = 0;
        int amount = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        
        while (true){
            number = Integer.parseInt(reader.nextLine());
            
            if (number != -1){
                if (number % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
                result += number;
                amount++;
                avg = 1.0 * result / amount;
                
            } else {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + result);
                System.out.println("How many numbers: "+ amount);
                System.out.println("Average: "+ avg);
                System.out.println("Even numbers: "+ even);
                System.out.println("Odd numbers: "+ odd);
                break;
            }
            
        }
            

    }
}
