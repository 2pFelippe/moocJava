/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Book{
    private String name;
    private int ageRec;
    
    public Book(String name, int ageRec){
        this.name = name;
        this.ageRec = ageRec;
    }
    
    public int getAgeRec(){
        return this.ageRec;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + "(recomended for " + this.ageRec + " years-olds or older)";
    }

   
    
    
    
    
    
}
