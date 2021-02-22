import java.util.Scanner;

	public class Palindrome3{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int number;
	System.out.println("Enter number: ");
	number = input.nextInt();

	int firstNumber = number/100;
	int thirdNumber = number%10;


	if (firstNumber == thirdNumber){

	System.out.println("this is a Palindrome");

	}

	if(firstNumber != thirdNumber){
	
	System.out.println("this is not a Palindrome");
	
	}
}
}