import java.util.Scanner;

  public class Arithemetic{

	public static void main(String[] main){

 int firstNumber;
 int secondNumber;
 int thirdNumber;
 int sum;
 int product;
 int average;
 int smallestNumber;
 int largestNumber;
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter First number");
	firstNumber = input.nextInt();

	System.out.println("Enter Second number");
	secondNumber = input.nextInt();

	System.out.println("Enter third number");
	thirdNumber = input.nextInt();

	sum = firstNumber + secondNumber + thirdNumber;
	System.out.println("The sum of the Equation is: " + sum);

	product = firstNumber * secondNumber * thirdNumber;
	System.out.println("The Product of the Equation is: " + product);

	average = (firstNumber + secondNumber + thirdNumber) / 3;
	System.out.println("The average of the Equation is: " + average);

	

	if (firstNumber < secondNumber && firstNumber < thirdNumber){   
	System.out.println("Smallest Number equals: " + firstNumber);
	}

	if (secondNumber < firstNumber && secondNumber < thirdNumber){
	System.out.println("Smallest number equals: " + secondNumber);
	}

	if (thirdNumber < firstNumber && thirdNumber < thirdNumber){
	System.out.println("Smallest number equals: " + secondNumber);
	}

	if (firstNumber > secondNumber && firstNumber > thirdNumber){   
	System.out.println("Largest Number equals: " + firstNumber);
	}

	if (secondNumber > firstNumber && secondNumber > thirdNumber){
	System.out.println("Largest Number equals: " + secondNumber);
	}

	if (thirdNumber > firstNumber && thirdNumber > secondNumber){
	System.out.println("Largest Number equals: " + thirdNumber);
	}

	

	

}


}