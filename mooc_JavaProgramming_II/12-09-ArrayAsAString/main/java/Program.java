
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));

        System.out.println("-----");
        
        int[][] matrix1 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix1));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        int helper = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                if (row > helper) {
                    builder.append("\n");
                    helper++;
                }
                builder.append(value);

            }
        }
        return builder.toString();
    }
}
