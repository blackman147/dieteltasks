package Personalkata;

public class HealthRecords2 {
    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int yearOfBirth;
    private double height;
    private double weight;
    int age;
    int maximumHeartRate;
    double targetHeartRate;
    double bmi;

    public HealthRecords2(String firstName, String lastName, String gender, int day, int month, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double calculateBmi(){
        bmi = (weight * 703)/(height * height);
        return bmi;
    }

}
