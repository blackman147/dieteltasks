package chapterThree;

public class TargetHeartRateTest {
    public static void main(String[] args) {

        TargetHeartRate targetHeartRate = new TargetHeartRate("Francis", "Obi",3, 7, 1994);
        System.out.println(" Your name is: " + targetHeartRate.getFirstName() + " " + targetHeartRate.getLastName());
        System.out.println("Age: " + targetHeartRate.CalculateAge() );
        System.out.println("Maximum heart rate: " + targetHeartRate.maximumHeartRate());
        System.out.println("Target heart rate: " + targetHeartRate.targetHeartRate());



    }
}
