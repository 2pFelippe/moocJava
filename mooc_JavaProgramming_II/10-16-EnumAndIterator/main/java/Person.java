/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education education){
        this.name = name;
        this.education = education;
    }
    
    public Education getEducation(){
        return this.education;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.education;
    }
    
    public boolean equals(Person compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person comparedPerson = (Person) compared;
        
        if(this.education == comparedPerson.education
            && this.name.equals(comparedPerson.getName())){
            return true;
        }
        
        return false;
    }
    
}
