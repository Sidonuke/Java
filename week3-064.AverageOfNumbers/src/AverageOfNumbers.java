
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        
        while (i < list.size()){
            sum += list.get(i);
            i++;
        } 
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double newSum = sum(list);
        double average = newSum/list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}