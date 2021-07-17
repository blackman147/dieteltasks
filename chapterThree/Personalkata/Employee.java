package Personalkata;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    double yearlySalary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0){
            System.out.println ("Employee salary not set" );
        }else
        this.monthlySalary = monthlySalary;
    }

    public double yearlySalary(){
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }
    public void salaryIncreaseRate(double rate){
        monthlySalary += (rate/100) * monthlySalary;
    }

    public double yearlySalaryAfterIncrease(double rate){
        yearlySalary = ( monthlySalary + (rate/100) * monthlySalary) * 12;
        return yearlySalary;
    }



}
