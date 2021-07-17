package Personalkata;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee ("Joy", "Udom", 100000);
        Employee secondEmployee = new Employee ("Francis", "Ntoka", 90000);

        System.out.println ("The firstname of employee 1 is: " + firstEmployee.getFirstName () );
        System.out.println ("The last name of employee 1 is: " + firstEmployee.getLastName () );
        System.out.println ("the monthly salary of employee 1 is: " + firstEmployee.getMonthlySalary () );
        System.out.println ("the yearly salary of employee 1 is: " + firstEmployee.yearlySalary());
        firstEmployee.salaryIncreaseRate (10);
        System.out.println ("the monthly salary of employee 1 after 10% increase is:  " + firstEmployee.getMonthlySalary () );
        System.out.println ("the yearly salary of employee 1 after 10% increase is:" + firstEmployee.yearlySalaryAfterIncrease (10));
        System.out.println ( );
        System.out.println ("The firstname of employee 2 is: " + secondEmployee.getFirstName () );
        System.out.println ("The last name of employee 2 is: " + secondEmployee.getLastName () );
        System.out.println ("the monthly salary of employee 2 is: " + secondEmployee.getMonthlySalary () );
        System.out.println ("the yearly salary of employee 2 is: " + secondEmployee.yearlySalary());
        secondEmployee.salaryIncreaseRate (10);
        System.out.println ("the monthly salary of employee 2 after 10% increase is:  " + secondEmployee.getMonthlySalary () );
        System.out.println ("the yearly salary of employee 2 after 10% increase is:" + secondEmployee.yearlySalaryAfterIncrease (10));
    }
}
