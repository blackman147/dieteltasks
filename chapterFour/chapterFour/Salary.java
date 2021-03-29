package chapterFour;

public class Salary {

    private String employeeName;
    private double salaryAmount;
    private int hourlyRates;
    int numberOfHoursWorked;

    public void employeeName(String firstName, String lastName ){
        employeeName = firstName + " " + lastName;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public double calculateTotalEarningsAfterFortyHours() {


        return  hourlyRates * numberOfHoursWorked ;
    }

    public void setHourlyRates(int hourlyRates) {
        this.hourlyRates =hourlyRates;
    }

    public int getHourlyRates() {
        return hourlyRates;
    }

    public void setNumbersOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
}
