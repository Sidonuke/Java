import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factoral = 1;
        int i = 1;
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i <= number){
            factoral *= i;
            i++;
        }   
        System.out.println("Factoral is " + factoral);    
    }
}
