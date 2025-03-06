/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Item {
    private String itemName;
    private int itemPrice;
    private int itemQty;
    
    public Item(String product, int qty, int unitPrice){
        this.itemPrice = unitPrice;
        this.itemQty = qty;
        this.itemName = product;
    }
    
    public int price(){
        return this.itemPrice * this.itemQty;
    }
    
    public void increaseQuantity(){
        this.itemQty++;
    }
    
    public String toString(){
        return this.itemName + ": "+ this.itemQty;
    }
    
}
