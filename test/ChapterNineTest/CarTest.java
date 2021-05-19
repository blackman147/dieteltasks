package ChapterNineTest;

import ChapterNine.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void inheritanceTest(){
        Car car = new Car();
        car.drive();
//        car.setNumberOfTyres(3);
        System.out.println(car.getNumberOfTyres());
    }

}