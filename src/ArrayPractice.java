public class ArrayPractice {
    public static int getTotal(int[][] array){
        int total = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                total = total + array[row][column];
            }
        }
        return total;
    }

    public static double getAverage (int[][] array){
        double average = 0;
        double total = 0;
        double numberOfValues = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                total = total + array[row][column];
                numberOfValues++;
            }
        }
        average = total/numberOfValues;
        return average;
    }

    public static int getRowTotal (int[][] array, int row){
        int rowTotal = 0;
        for(int column = 0; column < array[row].length; column++){
            rowTotal += array[row][column];
        }
        return rowTotal;
    }

    public static int getColumnTotal (int[][] array, int column){
        int columnTotal = 0;
        for (int row = 0; row < array.length; row++){
            columnTotal += array[row][column];
        }
        return columnTotal;
    }

    public static int getHighestInRow (int[][] array, int row){
        int rowHighest = 0;
        for (int column = 0; column < array[row].length; column++){
            rowHighest = array[row][0];
            if (array[row][column] > rowHighest){
                rowHighest = array[row][column];
            }
        }
        return rowHighest;
    }

    public static int getLowestInRow (int[][] array, int row){
        int rowLowest = 0;
        for (int column = 0; column < array[row].length; column++){
            rowLowest = array[row][0];
            if (array[row][column] < rowLowest){
                rowLowest = array[row][column];
            }
        }
        return rowLowest;
    }
}
