import java.util.Scanner;

public class Task6{

 public static void main(String[] args){


	Scanner blackie = new Scanner(System.in);

	int firstNumber;
	int secondNumber;
	int thirdNumber;
	int fourthNumber;
	int fifthNumber;

	System.out.println(" Enter first interger");
	firstNumber = blackie.nextInt();

	System.out.println(" Enter second interger");
	secondNumber = blackie.nextInt();
	
	System.out.println(" Enter third interger");
	thirdNumber = blackie.nextInt();

	System.out.println(" Enter fourth interger");
	fourthNumber = blackie.nextInt();

	System.out.println(" Enter fifth interger");
	fifthNumber = blackie.nextInt();
	int largestNumber;

	int smallestNumber;


	if (firstNumber > secondNumber){

		largestNumber = firstNumber;
		smallestNumber = secondNumber;
	}
	else {
		largestNumber = secondNumber;
		smallestNumber = firstNumber;
	}
	if (thirdNumber > largestNumber)
		largestNumber = thirdNumber;

	if (fourthNumber > largestNumber)
		largestNumber = fourthNumber;

	if (fifthNumber > largestNumber)
		largestNumber = fifthNumber;

	if (thirdNumber < smallestNumber)
		smallestNumber = thirdNumber;

	if (fourthNumber < smallestNumber)
		smallestNumber = fourthNumber;

	if (fifthNumber < smallestNumber)
		smallestNumber = fifthNumber;

	System.out.println(" The largest number is: " + largestNumber );
	System.out.println(" The smallest number is: " + smallestNumber );
	


}
}