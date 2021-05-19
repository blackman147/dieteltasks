package chapterFour;

public class Employee {
    private final String employeeName;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {


        this.firstName = firstName;
        this.lastName = lastName;
        employeeName = firstName + "   " + lastName;
    }
}
