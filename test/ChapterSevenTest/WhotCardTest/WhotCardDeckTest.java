package ChapterSevenTest.WhotCardTest;

import ChapterSevenTest.Card;
import ChapterSevenTest.CardDeck;
import ChapterSevenTest.StackOverflowException;
import ChapterSevenTest.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterSevenTest.Suit.*;
import static ChapterSevenTest.WhotCardTest.WhotSuit.*;
import static org.junit.jupiter.api.Assertions.*;

public class WhotCardDeckTest {

    private WhotCardDeck whotcardDeck;

    @BeforeEach
    void setUp() {
        whotcardDeck = new WhotCardDeck (4);
    }

    @Test
    void cardDeckHasFixedSize(){
        WhotCardDeck whotCardDeck = new WhotCardDeck (4);
        assertEquals(4, whotCardDeck.getSize());
    }

    @Test
    void pushOnce_elementPushedShouldBeLast(){
        WhotCardDeck whotCardDeck = new WhotCardDeck (1);
        WhotCard whotCard = new WhotCard (STAR,5);
        whotCardDeck.push(whotCard);
        assertSame(whotCard, whotCardDeck.peek());
    }
    @Test
    void pushTwice_popOnce_peek_shouldReturnFirstElement(){
        WhotCard firstCard = new WhotCard (CIRCLE, 5);
        WhotCard secondCard = new WhotCard (TRIANGLE, 5);
        whotcardDeck.push(firstCard);
        whotcardDeck.push(secondCard);
        WhotCard poppedCard = whotcardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, whotcardDeck.peek());
    }

    @Test
    void popEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(whotcardDeck.isEmpty());

        assertThrows(StackUnderflowException.class, ()-> whotcardDeck.pop() );
    }

    @Test
    void pushIntoFullDeck_throwsStackOverFlowException(){
        WhotCard whotCard = new WhotCard (STAR, 4);
        for (int i = 0; i < 4 ; i++) {
            whotcardDeck.push(whotCard);
        }
        assertTrue(whotcardDeck.isFull());
        assertThrows(StackOverflowException.class, () -> whotcardDeck.push(whotCard));
    }

    @Test
    void peekingEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(whotcardDeck.isEmpty());
        assertThrows(StackUnderflowException.class, () -> whotcardDeck.peek());
    }

    @Test
    void cardDeckCanBeShuffled(){
        WhotCardDeck whotCardDeck = new WhotCardDeck (5);
        WhotCard firstCard = new WhotCard (STAR, 5);
        WhotCard secondCard = new WhotCard (TRIANGLE, 7);
        WhotCard thirdCard = new WhotCard (CIRCLE, 4);
        WhotCard fourthCard = new WhotCard (SQUARE,14);
        WhotCard fifthCard = new WhotCard (CROSS, 7);

        whotCardDeck.push (firstCard);
        whotCardDeck.push (secondCard);
        whotCardDeck.push(thirdCard);
        whotCardDeck.push (fourthCard);
        whotCardDeck.push (fifthCard);
        assertSame (fifthCard, whotCardDeck.peek ( ));
        whotCardDeck.shuffle();
        assertNotSame (fifthCard, whotCardDeck.peek ());
    }
    @Test
    void canCreateAFullCardDeck(){
        whotcardDeck.createsAFullCardDeck ();
        assertTrue (whotcardDeck.isFull());
        assertEquals (54, WhotCardDeck.getSize () );
    }

}

