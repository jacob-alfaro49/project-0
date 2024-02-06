public class SudokuSquare {
    public static void check (int[][] square){
        boolean checkValue = true;
        // check if the array contains the numbers 1-9
        int[] numberCheck = {1,2,3,4,5,6,7,8,9};
        int[] sudokuNumbers = new int[9];
        int count = 1;
        boolean sameNumbers = true;
        int i = 0;
        while (count < 10) {
            for (int row = 0; row < square.length; row++) {
                for (int column = 0; column < square[row].length; column++) {
                    if (square[row][column] == count){
                        sudokuNumbers[count - 1] = square[row][column];
                    }
                }
            }
            count++;
        }
        if (numberCheck.length != sudokuNumbers.length){
            sameNumbers = false;
        }
        while (sameNumbers && i < numberCheck.length)
        {
            if (numberCheck[i] != sudokuNumbers[i]){
                checkValue = false;
            }
            i++;
        }

        // check if each row, column, and diagonal add to the same number
        int[] totals = new int[8];
        int rowNumber = 0;
        int columnNumber = 0;

        while (rowNumber < 3){
            int total = 0;
            for (int c = 0; c < square[rowNumber].length; c++){
                total+= square[rowNumber][c];
            }
            totals[rowNumber] = total;
            rowNumber++;
        }
        while (columnNumber < 3){
            int total = 0;
            for (int r = 0; r < square.length; r++){
                total+= square[r][columnNumber];
            }
            totals[columnNumber + 3] = total;
            columnNumber++;
        }
        totals[6] = square[0][0] + square[1][1] + square[2][2];
        totals[7] = square[0][2] + square[1][1] + square[2][0];
        for (int x:totals){
            if (x != totals[0]){
                checkValue = false;
            }
        }


        if (checkValue){
            System.out.println("The array is a magic Sudoku Square!");
        }
        else {
            System.out.println("The array is not a magic Sudoku Square");
        }
    }
}
