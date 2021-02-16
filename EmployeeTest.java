public class EmployeeTest{

	public static void main(String[] args){

		Employee employeeOne = new Employee("Aideloje", "Peter", 100000);

		Employee employeeTwo = new Employee("Francis", "Obi", 90000);


		employeeOne.setFirstName("Blackie");
		System.out.println(employeeOne.getFirstName());

		employeeTwo.setFirstName("Francis");
		System.out.println(employeeTwo.getLastName());

		System.out.printf("Annual salary of employee one: %f%n", employeeOne.getSalary() * 12 * 1.1);
		System.out.printf("Annual salary of employee two: %f%n", employeeTwo.getSalary() * 12 * 1.1);


}

}