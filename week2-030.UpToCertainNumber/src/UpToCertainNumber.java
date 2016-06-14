
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstnum = 1;
        
        System.out.println("Up to what number? ");
        int maxNumber = Integer.parseInt(reader.nextLine());
        
        while (firstnum <= maxNumber){
            System.out.println(firstnum);
            firstnum++;
        }
        
        // Write your code here
        
    }
}
