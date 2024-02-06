public class ArrayPracticeDemo {
    public static void main(String[] args){
        int[][] array = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int total = ArrayPractice.getTotal(array);
        System.out.println("The total is " + total);
        double average = ArrayPractice.getAverage(array);
        System.out.println("The average is " + average);
        int rowTotal = ArrayPractice.getRowTotal(array, 0);
        System.out.println("The total of row 1 is " + rowTotal);
        int columnTotal = ArrayPractice.getColumnTotal(array, 0);
        System.out.println("The total of column 1 is " + columnTotal);
        int highestInRow = ArrayPractice.getHighestInRow(array, 0);
        System.out.println("The highest value in row 1 is " + highestInRow);
        int lowestInRow = ArrayPractice.getLowestInRow(array, 0);
        System.out.println("The lowest value in row 1 is " + lowestInRow);
    }
}