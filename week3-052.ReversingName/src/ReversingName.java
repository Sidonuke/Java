import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int j = name.length()-1;
        int i = 0;
        String reverse = "";
        
        while (j >= i){
            reverse += "" + name.charAt(j);
            j--;
        }System.out.println("In reverse order: " + reverse);
    }
}
