import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers: ");
        int userInput;
        while (true){
            userInput = Integer.parseInt(reader.nextLine());
            if (userInput == -1){
                System.out.println("sum: " + stats.sum());
                System.out.println("sum of even: " + even.sum());
                System.out.println("sum of odd: " + odd.sum());
                break;
            } else {
                stats.addNumber(userInput);
                if (userInput % 2 == 0){
                    even.addNumber(userInput);
                } else {
                    odd.addNumber(userInput);
            
        }
        }
        
      /*  stats.addNumber(userInput);
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
*/
       // System.out.println("sum: "+ stats.sum());
        //System.out.println("sum of even: "+even.sum());
        //System.out.println("sum of odd: "+odd.sum());
}
}
}
