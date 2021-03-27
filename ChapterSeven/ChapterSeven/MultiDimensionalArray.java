package ChapterSeven;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 5}, {2, 3, 4}, {6, 7, 8}, {5, 6, 7}, {7, 17, 22}};

        int [] [] array2 = {{1, 2, 4}, {3, 5, 6}, {5, 7}};

        System.out.println("the values of your array are: ");
        outputArray(array);

        System.out.println("the values of your array are:" );
        outputArray(array2);
    }
    public static void outputArray(int [] [] array){


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d    ", array[row][column]);
            }
            System.out.println();
        }
    }
}
