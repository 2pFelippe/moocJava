
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            list.add(Integer.valueOf(input));
        }
        
        System.out.println(positive(list));
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> list = numbers.stream().filter(number -> number >=0).collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

}
