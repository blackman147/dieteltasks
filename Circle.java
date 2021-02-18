import java.util.Scanner;

 public class Circle{

	public static void  main(String[] args){

		Scanner calculation = new Scanner(System.in);


	double PIE = 3.14159;
	double radius;
	
	




	System.out.print("Enter the radius of the circle: " + radius);
	radius = calculation.nextInt();

	double area = PIE * (radius * radius);
	System.out.println("The area of the circle is: " + area);

	double circumference = 2 * 3.14159 * radius;
	System.out.println("The circumference of is: " + circumference);
}





}
