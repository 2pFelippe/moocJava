/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author PP
 */
public class Package {
    private ArrayList<Gift> gifts;
    
        
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
        
    }
    
    public int totalWeight(){
        int total = 0;
        for(Gift gift:this.gifts){
            total += gift.getWeight();
        }
        return total;
    }
}
