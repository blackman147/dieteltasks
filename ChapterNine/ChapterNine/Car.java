package ChapterNine;

public class Car extends Vehicle{

    public Car(){

        super(4);
        System.out.println("i wan create car");
    }

    @Override
    public void drive(){
        System.out.println("Drive like a car");
    }


    public void parentDrive(){

    }
}
