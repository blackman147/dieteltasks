package KataTest;

import java.util.Random;

public class Kata2 {
    public void shuffle(int[] numbers) {
        int index, temp;
        Random randomGenerator = new Random();
        for (int i = numbers.length -1; i > 0 ; i--) {
            index = randomGenerator.nextInt(i +1);

             temp = numbers[index];
             numbers[index ] = numbers[i];
             numbers[i] = temp;

        }
    }

    public void sortAscendingOrder(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

    }

    public void sortDescendingOrder(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
