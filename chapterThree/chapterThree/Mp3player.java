package chapterThree;

public class Mp3player {
    private String name;
    private boolean isOn;
    private int volume;
    private int currentTrack;
    private boolean isPlaying;
    private boolean isPaused;
    private int totalTracks;

    public Mp3player(String name, boolean isOn, int volume, int currentTrack, boolean isPlaying, boolean isPaused, int totalTracks){

        this.name = name;
        this.isOn = isOn;
        this.volume = volume;
        this.currentTrack = currentTrack;
        this.isPlaying = isPlaying;
        this.isPaused = isPaused;
        this.totalTracks = totalTracks;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
        if (isOn == true){
            isOn = false;
        }
        else {
            isOn = true;
        }
    }

    public int getVolume() {
        if (isOn == true){
        return volume;
        }
        return 0;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        if (isOn == true)
        isPlaying = playing;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public int getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
    }

    public void increaseVolume(){
        if (isOn == true){
            if (volume > 0 && volume <= 100){
                volume++;
            }
            else
                System.out.println("Maximum limit reached!!");
        }
    }

    public void decreaseVolume(){
            if (isOn == true){
                if (volume <= 100 && volume >=1){
                    volume--;
                }
                else
                    System.out.println("minimum volume reached");
            }

    }
}
