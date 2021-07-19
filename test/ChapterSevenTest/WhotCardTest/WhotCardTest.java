package ChapterSevenTest.WhotCardTest;

import org.junit.jupiter.api.Test;


import static ChapterSevenTest.WhotCardTest.WhotSuit.*;
import static org.junit.jupiter.api.Assertions.*;

public class WhotCardTest {
    @Test
    void triangleCardCanBeCreated(){
        WhotCard whotcard = new WhotCard (TRIANGLE, 2);
        assertSame(TRIANGLE, whotcard.getWhotSuit ());
    }

    @Test
    void circleCardCanBeCreated(){
        WhotCard whotCard = new WhotCard (CIRCLE,2);
        assertSame (CIRCLE, whotCard.getWhotSuit ());
    }

    @Test
    void starsCardCanBeCreated(){
        WhotCard whotCard = new WhotCard (STAR,2);
        assertSame (STAR, whotCard.getWhotSuit ());
    }

    @Test
    void squaresCanBeCreated(){
        WhotCard whotCard = new WhotCard (SQUARE,2);
        assertSame (SQUARE, whotCard.getWhotSuit ());
    }

    @Test
    void crossCanBeCreated(){
        WhotCard whotCard = new WhotCard (CROSS,2);
        assertSame (CROSS, whotCard.getWhotSuit ());
    }
    @Test
    void numericCardValuesCanBeCreated(){
        WhotCard whotCard = new WhotCard (CROSS,4);
        assertEquals ("4", whotCard.getValue());
    }

//    @Test
//    void testThatSuitCannotContainInvalidValues(){
//        WhotCardDeck.createsAFullCardDeck ();
//
//        assertEquals (54, WhotCardDeck.getSize ());
//        as
//    }


}
