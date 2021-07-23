package chapterThree;

public class HealthRecords {

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    double weight;
    double height;
    int age;
    int maximumHeartRate;
    double targetHeartRate;
    double bodyMassIndex;

    public HealthRecords(String firstName, String lastName, String gender, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int calculateAge() {
        age = 2021 - year;
        return age;
    }

    public int maximumHeartRate() {
        maximumHeartRate = 220 - age;
        return maximumHeartRate;

    }
    public double targetHeartRate(){
        targetHeartRate = 0.65 * maximumHeartRate;
        return targetHeartRate;
    }

    public double BMICalculator(){
        bodyMassIndex = (weight * 703)/(height * height);
        return bodyMassIndex;
    }
}
