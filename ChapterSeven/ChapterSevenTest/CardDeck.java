package ChapterSevenTest;

import java.util.IllegalFormatCodePointException;

public class CardDeck {
    private int lastPushLocation = -1;
    private Card[] cards;

    public CardDeck(int numberOfCards) {
       cards = new Card[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        if (isFull()) throw new StackOverflowException("Card deck is full");
        lastPushLocation++;
        cards[lastPushLocation] = card;
    }

    public Object peek() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return cards[lastPushLocation];
    }

    public Card pop() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return cards[lastPushLocation--] ;
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize() -1;
    }
}
