public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        MagicSquare square = new MagicSquare(size);
        int[][] grid = square.getSquare(); // Assuming a getter for the internal grid

        int row = 0;
        int col = size / 2;
        int num = 1;

        while (num <= size * size) {
            grid[row][col] = num;
            num++;

            int nextRow = (row - 1 + size) % size; // Move up
            int nextCol = (col + 1) % size; // Move right

            if (grid[nextRow][nextCol] != 0) {
                // If the cell is already occupied, move down instead
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }
}