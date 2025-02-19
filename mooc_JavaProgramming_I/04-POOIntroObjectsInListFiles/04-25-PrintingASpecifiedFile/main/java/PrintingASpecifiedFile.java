
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inicio
        System.out.println("Which file should have its contents printed?");
        
        //criando scanner através da string passada pelo user
        String input = scanner.nextLine();
        //alocando path ao constructor do scanner
        try(Scanner fileHandler = new Scanner(Paths.get(input))){
            //loop enquando tiver linhas no arquivo
            while(fileHandler.hasNextLine()){
                //alocando linha a variável
                String row = fileHandler.nextLine();
                //printando linhas
                System.out.println(row);
            }
            
        }
        //exception
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
