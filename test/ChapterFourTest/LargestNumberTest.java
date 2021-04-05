package ChapterFourTest;

import chapterFour.LargestNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    LargestNumber largest;

    @BeforeEach
    void startWithThis(){
        largest = new LargestNumber();
    }

    @AfterEach
    void tearDown(){
        largest = null;
    }

    @Test
    void largestNumberCanBeCreated(){
        assertNotNull(largest);
    }
    @Test
    void createCounterValueTest(){
        assertEquals(0, largest.getCounterValue());
    }
    @Test
    void listOfNumbersCanBeCreated(){
        largest.setTotalNumberInTheCounter();
        assertEquals(10, largest.getTotalNumberInTheCounter());
    }

    @Test
    void userCanCheckLargestNumber(){
        largest.largestNumber(20);
        assertEquals(20, largest.getLargestNumber());
    }

    @Test
    void userCanCheckLargesNumberMultipleTimes(){
        largest.largestNumber(20);
        largest.largestNumber(30);
        largest.largestNumber(40);
        largest.largestNumber(10);
        largest.largestNumber(90);
        largest.largestNumber(50);
        largest.largestNumber(60);
        largest.largestNumber(20);
        largest.largestNumber(80);
        largest.largestNumber(76);
        assertEquals(90, largest.getLargestNumber());

    }

    @Test
    void userCanCheckThatInputWhereCollectedTenTimes(){
        largest.largestNumber(20);
        largest.largestNumber(30);
        largest.largestNumber(40);
        largest.largestNumber(10);
        largest.largestNumber(90);
        largest.largestNumber(50);
        largest.largestNumber(60);
        largest.largestNumber(20);
        largest.largestNumber(80);
        largest.largestNumber(76);
        assertEquals(10, largest.getCounterValue());

    }

}