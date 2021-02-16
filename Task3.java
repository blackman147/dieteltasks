import java.util.Scanner;

	public class Task3{


		public static void main(String[] args){

		int numberOne;
		
		int numberTwo;

		int sum;

		int product;

		int difference;

		int quoient;

      		Scanner blackie = new Scanner(System.in);

		System.out.println(" Enter first interger");

		numberOne = blackie.nextInt();

		System.out.println(" Enter second interger");
		
		numberTwo = blackie.nextInt();

		sum = numberOne + numberTwo;
		System.out.printf("sum %d%n", sum);

		product = numberOne * numberTwo;
		System.out.printf("product %d%n", product);

		difference = numberOne - numberTwo;
		System.out.printf("difference  %d%n", difference);


		quoient = numberOne / numberTwo;
		System.out.printf("quoient %d%n", quoient);
}


}