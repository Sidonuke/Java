import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        
        while (i < list.size()){
            sum += list.get(i);
            i++;
        } 
        return sum;
    }
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double newSum = sum(list);
        double average = newSum/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
         double listavg = average(list);
         double varr = 0;
         for (int i : list) {
             varr += (double)Math.pow((i) - listavg, 2);
        }
         varr /= (list.size()-1); 
        return varr;
        }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }
//sample variance is ((3 - 3.5)² + (2 - 3.5)² + (7 - 3.5)² + (2 - 3.5)²)/(4 - 1)
}
