public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private final int remember;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.remember = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }
    public void setInitial(){
        this.value = this.remember;
    }
    
    public void decrease() {
        if (this.value <= 0) {
       
    } else {
            this.value--;
        }
    }
    public void reset(){
        this.value = 0;
        
    }

    
    }
