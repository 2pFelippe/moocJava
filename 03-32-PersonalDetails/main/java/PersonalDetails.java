
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String longest = "";
        int birth = 0;
        int sum = 0;
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String data[] = input.split(",");
            name = data[0];
            birth = Integer.valueOf(data[1]);
            count +=1;
            
            sum += birth;
            if(name.length() > longest.length()){
                longest = name;
            }           
            
        }
        
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years:"+1.0*sum/count);
    }
}
