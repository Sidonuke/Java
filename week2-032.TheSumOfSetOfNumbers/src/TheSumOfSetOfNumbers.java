
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        
        System.out.print("Until what? ");
        int finale = Integer.parseInt(reader.nextLine());
        
        while (n <= finale){
            sum += n;
            n++;
        }
        System.out.println("The sum is " + sum);

    }
}
