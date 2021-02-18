import java.util.Scanner;

 public class Cylinder{

	public static void  main(String[] args){

		Scanner calculation = new Scanner(System.in);


	double PIE = 3.14159;
	double length;
	double radius;
	



	System.out.print("Enter the radius of the circle: ");
	radius = calculation.nextInt();

	System.out.println("Enter the length: " );
	length = calculation.nextInt();

	double area = PIE * (radius * radius);
	System.out.println("The area of the circle is: " + area);

	double volume = area * length;
	System.out.println("The volume of the circle is: " + volume);
}





}
