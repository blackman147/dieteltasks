import java.util.Scanner;

public class Task5{

	public static void main(String[] args){

	Scanner blackie = new Scanner(System.in);

	int firstNumber;

	int secondNumber;

	int thirdNumber;
	
	int sum;

	int average;

	int product;

	
	System.out.println(" Enter first integer: ");
	firstNumber = blackie.nextInt();

	System.out.println(" Enter second integer: ");
	secondNumber = blackie.nextInt();

	System.out.println(" Enter third integer: ");
	thirdNumber = blackie.nextInt();

	sum = firstNumber + secondNumber + thirdNumber;
	System.out.println(" sum is: " + sum);

	average = firstNumber + secondNumber + thirdNumber % 3;
	System.out.println(" Average is: " + average);

	product = firstNumber * secondNumber * thirdNumber;
	System.out.println(" product is: " + product);

	if (firstNumber > secondNumber)
	System.out.println("firstNumber is the largest");

	if (firstNumber >  thirdNumber )
	System.out.println("firstNumber is the largest");

	if (secondNumber > firstNumber)
	System.out.println("secondNumber is the largest");

	if (secondNumber > thirdNumber)
	System.out.println("secondNumber is the largest");

	if (thirdNumber > firstNumber)
	System.out.println("thirdNumber is the largest");

	if (thirdNumber > secondNumber )
	System.out.println("thirdNumber is the largest");	

	if (firstNumber < secondNumber)
	System.out.println("firstNumber is the smallest");

	if (firstNumber < thirdNumber)
	System.out.println("firstNumber is the smallest");
	
	if (secondNumber < firstNumber)
	System.out.println("secondNumber is the smallest");

	
	if (secondNumber < thirdNumber )
	System.out.println("secondNumber is the smallest");

	if (thirdNumber < firstNumber)
	System.out.println("thirdNumber is the smallest");

	if (thirdNumber < secondNumber )
	System.out.println("thirdNumber is the smallest");


	}


} 

