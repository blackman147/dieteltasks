package chapterThree;

public class TargetHeartRate {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    int age;
    int maximumHeartRate;
    double targetHeartRate;

    public TargetHeartRate(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
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
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int CalculateAge(){
       age = 2021 - year;
       return age;

    }
    public int maximumHeartRate(){
        maximumHeartRate = 220 - age;
        return maximumHeartRate;

    }

    public double targetHeartRate(){
        targetHeartRate = 0.65 * maximumHeartRate;
        return targetHeartRate;
    }


}
