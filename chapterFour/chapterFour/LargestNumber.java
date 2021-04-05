package chapterFour;

public class LargestNumber {
    int counter;
    int largestNumber;

    public void setTotalNumberInTheCounter() {
        for ( counter = 0; counter < 10; counter++) {

        }
    }

    public int getTotalNumberInTheCounter() {
        return counter;
    }

    public void largestNumber(int number) {
        for ( counter = 0; counter < 10; counter++) {
            if (number > largestNumber)
                largestNumber = number;
        }
    }

    public int getLargestNumber() {
        return largestNumber;
    }

    public int getCounterValue() {
        return counter;
    }
}