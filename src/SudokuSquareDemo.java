public class SudokuSquareDemo { //Jacob Alfaro
    public static void main (String[] args){
        int[][] sudokuSquare = {{2,7,6}, //Any 2d array can be used to check and see if it is a magic sudoku square
                {9,5,1},
                {4,3,8}};
        SudokuSquare.check(sudokuSquare);
    }
}
