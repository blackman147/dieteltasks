package chapterFiveTest;

import ChapterSix.Kata1;
import chapterFour.Kata;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest  {

    @Test
    void arrayReturninigSum(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        assertEquals(15, kata1.getSum(array));

    }

    @Test
    void arrayAverage(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        assertEquals(3, kata1.getAverage(array));
    }

    @Test
    void arrayMaximumNumber(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        int maximumNumber = kata1.getMaximum(array);
        assertEquals(5, maximumNumber);
    }

    @Test
    void arrayMinimumNumber(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        int minimumNumber = kata1.getMinimum(array);
        assertEquals(1, minimumNumber);
    }

    @Test
    void arrayMaxSum(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        int maxSum = kata1.getMaximumSum(array);
        assertEquals(14, maxSum);
    }

    @Test
    void arrayMinSum(){
        Kata1 kata1 = new Kata1();
        int [] array = {1,2,3,4,5};
        int minSum = kata1.getMinimumSum(array);
        assertEquals(10,minSum);
    }
}
