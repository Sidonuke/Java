
import java.util.Scanner;

public class SumOfThePowers {
 // -1 from end result, power index @ 0, begin int 2
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 2;
        int i = 0;
        int result = 1;
        
        System.out.print("Type a number: ");
        int given = Integer.parseInt(reader.nextLine());
        given += 1;
        
        while (i <= given){
            result = (int)Math.pow(number, given);
            i++;
        }
            result -= 1;
        System.out.println("The result is " + result);
    }
}
