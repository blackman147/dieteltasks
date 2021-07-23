package Personalkata;

public class HeartRateTest {
    public static void main(String[] args) {
        HeartRate heartRate = new HeartRate ("Francis", "Ntoka", 03, 07, 1992);
        System.out.println ("Your Name is: " + heartRate.getFirstName () + " " + heartRate.getLastName () );
        System.out.println ("Your age is: " + heartRate.calculateAge () );
        System.out.println ("Your Maximum Heart Rate is: " + heartRate.maximumHeartRate () );
        System.out.println ("Your Target Heart Rate is: " + heartRate.targetHeartRate () );
    }
}
