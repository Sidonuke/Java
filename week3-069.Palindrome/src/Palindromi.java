import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int j = text.length()-1;
        int i = 0;
        String reversed = "";
        
        while (j >= i){
            reversed += "" + text.charAt(j);
            j--;
        }if (reversed.equals(text)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

//public static String reverse(String text) {
  //      int j = text.length()-1;
    //    int i = 0;
      //  String reversed = "";
        
       // while (j >= i){
         //   reversed += "" + text.charAt(j);
           // j--;
       // }//System.out.println("In reverse order: " + stupid);
       // return reversed;