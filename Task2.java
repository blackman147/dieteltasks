import java.util.Scanner; 

public class Task2{

	public static void main(String[] args){


	int variablex;

	int variabley;

	int variablez;
	
	

	Scanner product = new Scanner(System.in);

	System.out.println(" Enter first interger");

		variablex = product.nextInt();

	System.out.println(" Enter second interger");

		variabley = product.nextInt();

	System.out.println(" Enter third interger");

		variablez = product.nextInt();

	int result = variablex * variabley * variablez;

	System.out.printf(" your answer is %s%n" , result);

	}


}