package personalKataTest;

public class ApCalculator {
    int commonDifference;
    int n = 4;
    int nextNumber;

    public int calculateAp(int firstNumber, int secondNumber, int thirdNumber) {
        if (( secondNumber - firstNumber) == (thirdNumber - secondNumber)){
            commonDifference = thirdNumber - secondNumber;
            nextNumber = firstNumber + (n-1) * commonDifference;
        }

        return nextNumber;
    }
}
