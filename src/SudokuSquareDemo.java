public class SudokuSquareDemo {
    public static void main (String[] args){
        int[][] sudokuSquare = {{2,7,6}, //This is the sudoku square we are testing
                {9,5,1},
                {4,3,8}};
        SudokuSquare.check(sudokuSquare);
    }
}
