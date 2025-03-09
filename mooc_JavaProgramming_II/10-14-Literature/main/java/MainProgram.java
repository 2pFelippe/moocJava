import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int count = 0;
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String name = input;
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(input,age);
            books.add(book);
            count++;
        }
        System.out.println(count+" books in total.");
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRec).thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        for(Book book: books){
            System.out.println(book);
        }
    }

}
