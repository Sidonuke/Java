
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true){
            System.out.print("Give me a number: ");
            double number = Double.parseDouble(reader.nextLine());
            if ((number < -30) || (number > 40)){
                System.out.println("Unacceptable");
            } else {
                Graph.addNumber(number);
                System.out.println("Input Accepted!");
            
        
        // Graph is used as 3;
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
}
}