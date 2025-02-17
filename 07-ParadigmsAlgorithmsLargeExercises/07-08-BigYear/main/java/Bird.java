/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Bird {
    private String name;
    private String ciName;
    private int observation;
    
    public Bird(String name, String ciName){
        this.name = name;
        this.ciName = ciName;
        this.observation = 0;
    }
    
    public void printBird(){
        System.out.println(this.name+" ("+this.ciName+"): " + this.observation+" observations");
    }
    
    public void printOneBird(String name){
        System.out.println(this.name+" ("+this.ciName+"): " + this.observation+" observations");
    }
    
    public void addObservation(){
        this.observation ++;  
    }
    
    public String getName(){
        return this.name;
    }
    
     public String getCiName(){
        return this.ciName;
    }
    
      public int getObservations(){
        return this.observation;
    }
    
    
}
