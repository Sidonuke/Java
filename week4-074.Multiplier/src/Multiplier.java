/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidonuke
 */
public class Multiplier {
    private int multiplied;
    
    public Multiplier (int number){
        this.multiplied = number;
    }
    
    public int multiply(int otherNumber){
        return this.multiplied * otherNumber;
    } 
}
