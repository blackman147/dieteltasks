package KataTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    void numbersCanBeShuffled(){
        Kata2 kata = new Kata2();
        int[] numbers = {2,0,1,5};
        assertEquals(5, numbers[3]);
        kata.shuffle(numbers);
        assertNotEquals(2, numbers[0]);
    }

    @Test
    void numbersInArrayCanBeSortedInAscendingOrder(){
        Kata2 kata = new Kata2();
        int[] numbers = {2,0,1,5};
        assertEquals(5, numbers[3]);
        kata.sortAscendingOrder(numbers);
        assertEquals(1, numbers[1]);
    }

    @Test
    void numbersInArrayCanBeSortedInDescendingOrder(){
        Kata2 kata = new Kata2();
        int[] numbers = {2,0,1,5};
        assertEquals(5, numbers[3]);
        kata.sortDescendingOrder(numbers);
        assertEquals(1, numbers[2]);
    }

}
