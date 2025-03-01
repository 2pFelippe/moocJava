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
    private String id;
    private String name;
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item itemCompared = (Item) compared;
        
        if(itemCompared.id.equals(this.id)){
            return true;
        }
        
        return false;
    }
}
