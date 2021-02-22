import java.util.Scanner;


	public class Palindrome	{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int firstNumber;
	
	int secondNumber;

	int thirdNumber;

	System.out.println("Enter first number: ");
	firstNumber = input.nextInt();

	System.out.println("Enter second number: ");
	secondNumber = input.nextInt();

	System.out.println("Enter thrid number: ");
	thirdNumber = input.nextInt();


	if (firstNumber == thirdNumber){

	System.out.println("this is a Palindrome");

	}

	if(firstNumber != thirdNumber){
	
	System.out.println("this is not a Palindrome");
	
	}
}
}