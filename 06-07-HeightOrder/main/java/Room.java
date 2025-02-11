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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);
        for (Person shortestTest : this.persons) {
            if (shortestTest.getHeight() < shortest.getHeight()) {
                shortest = shortestTest;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if(this.persons.isEmpty()){
            return null;
        }
        
        Person shortest = shortest();
        this.persons.remove(shortest());
        
        return shortest;
    }
    
    
}
    
    