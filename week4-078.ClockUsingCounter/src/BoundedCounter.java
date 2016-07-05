/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidonuke
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit){
        this.upperLimit = upperLimit;
        //this.valueAtStart = 0;
    }
    public void next(){
        this.value++;
        if (this.value > this.upperLimit){
            this.value = 0;
        }
    }
    public String toString(){
        if (10 > this.value){
            return "0" + this.value;
        } else {
        return "" + this.value;
        }
    }
    public int getValue(){
            return this.value;
        }
    public void setValue(int start) {
        if (0 < start && start <= this.upperLimit) {
            this.value = start;
    }
    }
}
