
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                String toPrint = "The year is a leap year!";
                 System.out.println(toPrint);
                } else {
                    String toPrint = "This year is not a leap year!";
                    System.out.println(toPrint);
        }
    }
 }