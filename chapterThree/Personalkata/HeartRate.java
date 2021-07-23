package Personalkata;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int yearOfBirth;
    int age;
    int maximumHeartRate;
    double targetHeartRate;

    public HeartRate(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.yearOfBirth = year;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 12) {
            this.month = month;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int calculateAge(){
        age = 2021 - yearOfBirth;
        return age;
    }

    public int maximumHeartRate(){
         maximumHeartRate = 220 - age;
         return maximumHeartRate;
    }

    public double targetHeartRate(){
        targetHeartRate = 0.67 * maximumHeartRate;
        return targetHeartRate;
    }
}
