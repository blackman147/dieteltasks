package ChapterNine;

public class Vehicle extends Van {

    private int numberOfTyres = 6;

    public Vehicle(int numberOfTyres){
        this.numberOfTyres = numberOfTyres;
        System.out.println("Who dey disturb BREATH!!!!!!");
    }



    public void drive(){
        System.out.println("Drive like a car");
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }
}
