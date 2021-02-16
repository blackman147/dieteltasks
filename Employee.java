public class Employee{

	private String firstName;

	private String lastName;

	private double salary;

	public Employee(String firstName, String lastName, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	public void setLastName(String lastName){
		this.lastName = lastName;

	}

	public void setSalary(double salary){
		if (salary > 0.00){
			this.salary = salary;
		}
	
	}

	public double getSalary(){
	
	return salary;

	}

	public String getFirstName(){

		return firstName;

	}	

	public String getLastName(){
		return lastName;

	}

	




	

}