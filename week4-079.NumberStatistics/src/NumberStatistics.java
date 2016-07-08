
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        amountOfNumbers = 0;
    }
    public void addNumber(int number){
        sum += number;
        this.amountOfNumbers++;
    }
    public int amountOfNumbers(){
            return this.amountOfNumbers;
        }
    public int sum(){
        return sum;
    }
    public double average(){
     if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double)(this.sum*1.0)/this.amountOfNumbers;
    }
    }
