
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String elementsString = "";
        for(String element:this.elements){
            elementsString += element + "\n";
        }
        elementsString = elementsString.trim();
        
        if(this.elements.size() == 1){
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + elementsString;
        }
        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + elementsString;
    }
    
}
