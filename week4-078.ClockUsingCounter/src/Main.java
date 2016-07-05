
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        int i = 0;
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
       while ( i < 121 ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            } i++;
        }
    }
    }
