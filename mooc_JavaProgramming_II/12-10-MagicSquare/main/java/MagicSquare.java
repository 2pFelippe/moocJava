
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public int[][] getSquare(){
        return this.square;
    }
    
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int row = 0; row < this.square.length; row++) {
            int total = 0;
            for (int col = 0; col < this.square[row].length; col++) {
                total += this.square[row][col];
            }
            sums.add(total);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int col = 0; col < this.square.length; col++) {
            int total = 0;
            for (int row = 0; row < this.square.length; row++) {
                total += this.square[row][col];
            }
            sums.add(total);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sums = new ArrayList<>();
        int totalDiag1 = 0; // Sum of the primary diagonal (top-left to bottom-right)
        int totalDiag2 = 0; // Sum of the secondary diagonal (top-right to bottom-left)

        for (int i = 0; i < this.square.length; i++) {
            totalDiag1 += this.square[i][i];
            totalDiag2 += this.square[i][this.square.length - 1 - i];
        }

        sums.add(totalDiag1);
        sums.add(totalDiag2);
        return sums;
    }

    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
