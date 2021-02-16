import java.util.Scanner; 

public class Task2{

	public static void main(String[] args){


	int x;

	int y;

	int z;
	
	

	Scanner product = new Scanner(System.in);

	System.out.println(" Enter first interger");

		x = product.nextInt();

	System.out.println(" Enter second interger");

		y = product.nextInt();

	System.out.println(" Enter third interger");

		z = product.nextInt();

	int result = x * y * z;

	System.out.printf(" your answer is %s%n" , result);

	}


}