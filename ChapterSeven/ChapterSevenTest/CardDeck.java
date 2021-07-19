package ChapterSevenTest;

import java.util.Random;

public class CardDeck {
    private int lastPushLocation = -1;
    private Card[] cards;
    private int numberOfCards;

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

    public Card peek() {
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

    public Card shuffle() {

        int index;
        Card temp;
        Random randomGenerator = new Random();
        for (int i = cards.length -1; i > 0 ; i--) {
            index = randomGenerator.nextInt(i + 1);

            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
        return cards[numberOfCards];
    }

//    public boolean compare(Card firstCard, Card secondCard) {
//        return (firstCard.getSuit ( ) == secondCard.getSuit ( )) || (firstCard.getValue ( ).equals (secondCard.getValue ( )));
//    }
}
