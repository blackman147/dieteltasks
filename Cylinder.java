import java.util.Scanner;

 public class Cylinder{

	public static void  main(String[] args){

		Scanner calculation = new Scanner(System.in);


	double PIE = 3.14159;
	double length;
	double radius;
	



	System.out.print("Enter the radius of the cylinder: ");
	radius = calculation.nextDouble();

	System.out.println("Enter the length: " );
	length = calculation.nextDouble();

	double area = PIE * (radius * radius);
	System.out.println("The area of the cylinder is: " + area);

	double volume = area * length;
	System.out.println("The volume of the cylinder is: " + volume);
}





}
