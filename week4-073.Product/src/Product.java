/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidonuke
 */
public class Product {
    private String name = "";
    private double cost = 0;
    private int quantity = 0;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.cost = priceAtStart;
        this.quantity = amountAtStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.cost + ", amount " + this.quantity);
    }
}
//Banana, price 1.1, amount 13