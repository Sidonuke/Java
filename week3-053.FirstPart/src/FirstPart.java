
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String userInput = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int section = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + userInput.substring(0,section));
    }
}
