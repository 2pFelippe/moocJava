
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> myList = new List<>();

        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.get(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
        
        System.out.println(myList.size());
        
        myList.add("hello");
        myList.add("world");
        
        System.out.println("-----------------------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.size());
    }

}
