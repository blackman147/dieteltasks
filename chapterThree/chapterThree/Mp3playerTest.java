package chapterThree;

public class Mp3playerTest {
    public static void main(String[] args) {
        Mp3player sony = new Mp3player("samsung", true, 27, 3, true, false, 13 );

        System.out.println("Your Mp3Player name is: " + sony.getName());

        System.out.println("volume: " + sony.getVolume());

        System.out.println("Current track: " + sony.getCurrentTrack());

        System.out.println("Total tracks: " + sony.getTotalTracks());

    }
}
