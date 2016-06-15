public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        int i = 1;
        while (i <= amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size){
            printWhitespaces(size-i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        while (i <= height){
            printWhitespaces(height - i);
            printStars(2 * i - 1);
            i ++;
        }
        int sWide = 2;
        while (--sWide >= 0){
            printWhitespaces(height-2);
            printStars(3);
        }
    }
    //The stand is two stars tall and three stars wide and it is located in the center of the bottom of the triangle.
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
