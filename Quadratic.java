import java.util.Scanner;
import java.lang.Math;

public class Quadratic{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	double a;

	double b;

	double c;

	double answerOne;

	double answerTwo;

	System.out.println("Enter the value for a");
		 a = input.nextDouble();


	System.out.println("Enter the value for b");
		 b = input.nextDouble();



	System.out.println("Enter the value for c");
		 c = input.nextDouble();

	answerOne = -b + Math.sqrt(Math.pow(b,2)) - (4 * a * c) / (2 * a);
	System.out.printf("The answer of equation1: " + answerOne + "\n" );

	answerTwo = -b - Math.sqrt(Math.pow(b,2)) - (4 * a * c) / (2 * a);
	System.out.printf("The answer of equation2: " + answerTwo );


}

}