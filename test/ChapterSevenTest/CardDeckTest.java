package ChapterSevenTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterSevenTest.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    private CardDeck cardDeck;
    @BeforeEach
    void setUp(){
        cardDeck = new CardDeck(4);
    }


    @Test
    void cardDeckHasFixedSize(){
        CardDeck cardDeck = new CardDeck(4);
        assertEquals(4, cardDeck.getSize());
    }
    @Test
    void pushOnce_elementPushedShouldBeLast(){
        CardDeck cardDeck = new CardDeck(4);
        Card card = new Card(DIAMOND,4);
        cardDeck.push(card);
        assertSame(card,cardDeck.peek());
    }

    @Test
    void pushTwice_popOnce_peek_shouldReturnFirstElement(){
        Card firstCard = new Card(SPADES, 5);
        Card secondCard = new Card(HEARTS, 5);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        Card poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, cardDeck.peek());
    }

    @Test
    void popEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(cardDeck.isEmpty());

        assertThrows(StackUnderflowException.class, ()-> cardDeck.pop() );
    }

    @Test
    void pushIntoFullDeck_throwsStackOverFlowException(){
        Card card = new Card(SPADES, 4);
        for (int i = 0; i < 4 ; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverflowException.class, () -> cardDeck.push(card));
    }

    @Test
    void peekingEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(cardDeck.isEmpty());

        assertThrows(StackUnderflowException.class, () -> cardDeck.peek());
    }

    @Test
    void cardDeckCanBeShuffled(){
        CardDeck cardDeck = new CardDeck(6);
        Card firstCard = new Card(SPADES, 5);
        Card secondCard = new Card(HEARTS, 5);
        Card thirdCard = new Card (CLUBS, 4);
        Card fifthCard = new Card (DIAMOND,5);
        Card sixthCard = new Card (HEARTS, 7);

        cardDeck.push (firstCard);
        cardDeck.push (secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push (fifthCard);
        cardDeck.push (sixthCard);
        assertSame (sixthCard, cardDeck.peek ( ));
        cardDeck.shuffle();
        assertNotSame (sixthCard, cardDeck.peek ());
    }

//    @Test
//    void testThatTwoCardInTheDeckCanBeCompared(){
//        CardDeck cardDeck = new CardDeck (2);
//        Card firstCard = new Card (DIAMOND, 5 );
//        Card secondCard = new Card (SPADES, 5);
//        assertTrue (cardDeck.compare (firstCard, secondCard));
//    }



}
