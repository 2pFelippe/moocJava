/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Container {
    public String name;
    public int total;
    public int max;
    public int min;
    
    public Container(String name){
        this.name = name;
        this.total = 0;
        this.max = 100;
        this.min = 0;
    }
    
    public void add(int value){
        if(this.total + value <= this.max){
            this.total += value;
        }else{
            this.total = 100;
        }
        
    }
    
    public int remove(int value){
        int removed = 0;
        if(this.total - value < min){
            removed = this.total;
            this.total = 0;
            return removed;
        }
        this.total -= value;
        return value;
    }
    
    
    public int getTotal(){
        return this.total;
    }
    
    public String toString(){
        return this.name + ": " + this.total +"/100";
    }
}
