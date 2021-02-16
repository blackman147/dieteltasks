import java.util.Scanner;
public class Task4{

	public static void main(String[] args){

 	int numberOne;

	int numberTwo;

	Scanner blackman = new Scanner(System.in);

	System.out.println(" Enter first integer: ");
	numberOne = blackman.nextInt();

	System.out.println(" Enter second interger: ");
	numberTwo = blackman.nextInt();

	if (numberOne > numberTwo)
		System.out.println(" NumberOne is larger "); 


	if (numberTwo > numberOne)
		System.out.println(" NumberTwo is larger ");

	if (numberOne == numberTwo)
		System.out.println(" These numbers are equal ");
}

}