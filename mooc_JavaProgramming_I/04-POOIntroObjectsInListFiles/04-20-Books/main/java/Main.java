
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int pages = 0;
        int pubYear = 0;

        while (true) {
            System.out.println("Title:");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            if (title.contains(",")) {
                String[] parts = title.split(",");
                title = parts[0];
                pages = Integer.valueOf(parts[1]);
                pubYear = Integer.valueOf(parts[2]);
            } else {
                System.out.println("Pages:");
                pages = Integer.valueOf(scan.nextLine());

                System.out.println("Publication year:");
                pubYear = Integer.valueOf(scan.nextLine());
            }

            books.add(new Book(title, pages, pubYear));

        }

        System.out.println("What information to be printed?");
        String input = scan.nextLine();

        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book);
            }
            if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
