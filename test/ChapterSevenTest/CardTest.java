package ChapterSevenTest;

import CardGameException.InvalidCardException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterSevenTest.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {


    @Test
    void heartsCardCanBeCreated(){
        Card card = new Card(HEARTS, 2);
        assertSame(HEARTS, card.getSuit());
    }

    @Test
    void diamondsCardCanBeCreated(){
        Card card = new Card(DIAMOND, 2);
        assertSame(DIAMOND, card.getSuit());
    }

    @Test
    void clubsCardCanBeCreated(){
        Card card = new Card(CLUBS, 2);
        assertSame(CLUBS, card.getSuit());
    }

    @Test
    void spadesCardCanBeCreated(){
        Card card = new Card(SPADES, 2);
        assertSame(SPADES, card.getSuit());
    }

    @Test
    void aceCardValueCanBeCreated(){
        Card card = new Card(SPADES, 1);
        assertEquals("Ace", card.getValue());
    }
    @Test
    void jackCardValueCanBeCreated(){
        Card card = new Card(SPADES, 11);
        assertEquals("Jack", card.getValue());
    }

    @Test
    void queenCardValueCanBeCreated(){
        Card card = new Card(SPADES, 12);
        assertEquals("Queen", card.getValue());
    }

    @Test
    void kingCardValueCanBeCreated(){
        Card card = new Card(SPADES, 13);
        assertEquals("King", card.getValue());
    }

    @Test
    void numericCardValueCanBeCreated(){
        Card card = new Card(SPADES, 4);
        assertEquals("4", card.getValue());
    }

    @Test
    void invalidCardExceptionIsThrownWheValueIsInvalid(){
       assertThrows(InvalidCardException.class, ()->new Card(DIAMOND, 14));
       assertThrows(InvalidCardException.class, ()-> new Card(CLUBS, 0));
    }

    @Test
    void cardToStringTest(){
        Card card = new Card (DIAMOND, 13);
        String expectedToString = "King of Diamond";
        assertEquals (expectedToString, card.toString ());
        card = new Card (CLUBS,1);
        expectedToString = "Ace of Clubs";
        assertEquals (expectedToString, card.toString ());
    }

    @Test
    void testSameCardValueEquals(){
        Card kingOfSpades = new Card (SPADES, 13);
        Card kingOfSDiamonds = new Card (DIAMOND, 13);
        assertEquals (kingOfSpades,kingOfSDiamonds);
    }

    @Test
    void testSameSuitValueEquals(){
        Card kingOfSpades = new Card (SPADES, 13);
        Card queenOfSpades = new Card (SPADES, 12);
        assertEquals (queenOfSpades, kingOfSpades);
        assertEquals (kingOfSpades, queenOfSpades);
//        CardDeck cardDeck = new CardDeck (2);
//        assertNotEquals (kingOfSpades, cardDeck);
    }


}
