package ChapterSix;

public class PrimeNumbers {
    public static String isPrime(int number) {
        int counter = 2;
        String isPrimeDigits = "";
        boolean isPrimeNumber = true;
        int score = 0;

        for (counter = 2; counter <= number / 2; counter++) {

            if (number % counter == 0) {
                isPrimeNumber = false;
                System.out.println(counter);

            }

            if (isPrimeNumber) {

                isPrimeDigits = number + " is a prime Number";
            } else isPrimeDigits = number + " is NOT a prime Number";

        }
        return isPrimeDigits;
    }

    public static String isPrimeNumbers(int digit) {
        int counter = 0;
        int count=0;
        int check=0;
        String isPrimeDigits = " ";
        boolean isPrimeNumber = true;

        for (counter = 1; counter <= digit/2; counter++) {
            int num = 0;

            for (count = counter; count >= 1; count--) {

                if (counter % count == 0) {
                    isPrimeNumber=false;
                    num = num + 1;
                    // System.out.println(counter);

                }
            }if (isPrimeNumber == true)
                if (num == 2) {
                    isPrimeDigits = isPrimeDigits + counter + " ";
                    check++;
                }
        }

        System.out.println("Prime numbers from 1 to 1000 are :");
        System.out.println("There are "+check+" prime number for the range of 1-1000");
        return isPrimeDigits;

    }
    public static String primeNumbers(int digit) {
        int counter = 0;
        int count=0;
        int check=0;
        String isPrimeDigits = " ";
        boolean isPrimeNumber = true;

        for (counter = 1; counter <= Math.sqrt(digit*1000); counter++) {
            int num = 0;

            for (count = counter; count >= 1; count--) {

                if (counter % count == 0) {
                    isPrimeNumber=false;
                    num = num + 1;


                }
            }if (isPrimeNumber == true)
                if (num == 2) {
                    isPrimeDigits = isPrimeDigits + counter + " ";
                    check++;
                }
        }

        System.out.println("Prime numbers from 1 to 1000 are :");
        System.out.println("There are "+check+" prime number for the range of 1-1000");
        return isPrimeDigits;

    }

    public static void main(String[] args) {
        System.out.println(primeNumbers(1000));
        System.out.println(isPrimeNumbers(1000));
    }
}
