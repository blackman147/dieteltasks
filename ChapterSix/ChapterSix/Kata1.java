package ChapterSix;

public class Kata1 {




    public int getSum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public int getAverage(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        int average = total / array.length;
        return average;
    }

    public int getMaximum(int[] array) {
        int maximumNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            maximumNumber = Math.max(array[i], maximumNumber );
        }
        return maximumNumber;
    }

    public int getMinimum(int[] array) {
        int minimumNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            minimumNumber = Math.min(array[i], minimumNumber );
        }
        return minimumNumber;
    }

    public int getMaximumSum(int[] array) {
        return getSum(array) - getMinimum(array);
    }

    public int getMinimumSum(int[] array) {
        return getSum(array) - getMaximum(array);
    }
}
