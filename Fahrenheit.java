import java.util.Scanner;

public class Fahrenheit{

	public static void main(String[] args){

	Scanner temperature = new Scanner(System.in);

	double degree;
	double fahrenheit;

	System.out.println("Enter temperature in degrees celsius : ");
	degree = temperature.nextDouble();

	fahrenheit =(9.0 / 5) * degree + 32;
	System.out.printf("%f Degree celsius is %f Fahrenheit", degree, fahrenheit );
	


 }



}