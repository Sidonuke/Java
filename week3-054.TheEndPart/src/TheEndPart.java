import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String userInput = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int section = Integer.parseInt(reader.nextLine());
        
        int length = userInput.length();
        int start = length-section;
        
        String endOf = userInput.substring(start);
        System.out.print("Result: " + endOf);
    }
}
