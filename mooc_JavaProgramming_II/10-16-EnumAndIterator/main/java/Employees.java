import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if (!this.persons.contains(personToAdd)) {
            this.persons.add(personToAdd);
        }
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!this.persons.contains(person)) {
                this.persons.add(person);
            }
        }
    }

    public void print() {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}