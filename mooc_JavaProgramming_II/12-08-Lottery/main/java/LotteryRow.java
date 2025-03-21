
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random luck = new Random();
        this.numbers = new ArrayList<>();
        while(this.numbers.size() < 7){
            int number = luck.nextInt(40) + 1;
            if(this.containsNumber(number)){
                continue;
            }
            this.numbers.add(number);
        }
    }

    public boolean containsNumber(int number) {
        for(int number1 : this.numbers){
            if(number1 == number){
                return true;
            }
        }
        return false;
    }
}

