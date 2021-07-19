package ChapterSevenTest.WhotCardTest;

import ChapterSevenTest.StackOverflowException;
import ChapterSevenTest.StackUnderflowException;

import java.util.Random;

public class WhotCardDeck {
    private static int lastPushLocation = -1;
    private static WhotCard[] whotCards;
    private int numberOfCards;

    public WhotCardDeck(int numberOfCards) {
        whotCards = new WhotCard[numberOfCards];
    }

    public static int getSize() {
        return whotCards.length;
    }


    public void push(WhotCard whotCard) {
        if (isFull()) throw new StackOverflowException ("Card deck is full");
        lastPushLocation++;
        whotCards[lastPushLocation] = whotCard;
    }

    public WhotCard peek() {
        if (isEmpty()) throw new StackUnderflowException ("Card deck is empty");
        return whotCards[lastPushLocation];
    }
    public WhotCard pop() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return whotCards[lastPushLocation--] ;
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public static boolean isFull() {
        return lastPushLocation == getSize() -1;
    }

    public WhotCard shuffle() {

        int index;
        WhotCard temp;
        Random randomGenerator = new Random();
        for (int i = whotCards.length -1; i > 0 ; i--) {
            index = randomGenerator.nextInt(i + 1);

            temp = whotCards[index];
            whotCards[index] = whotCards[i];
            whotCards[i] = temp;
        }
        return whotCards[numberOfCards];
    }

    public static WhotCardDeck createsAFullCardDeck(){
        WhotCardDeck deck = new WhotCardDeck (54);

        for (WhotSuit whotSuit : WhotSuit.values ()){
            switch (whotSuit){

                case TRIANGLE:
                    for (int i = 1; i <= 14 ; i++) {
                        if (i == 6 || i == 9){
                            continue;
                        }
                        deck.push (WhotCard.creatingATriangleCard(i));
                    }
                    break;
                case CIRCLE:
                    for (int i = 1; i <= 14 ; i++) {
                        if (i == 6 || i == 9){
                            continue;
                        }
                        deck.push (WhotCard.creatingACircleCard (i));
                    }
                    break;
                case STAR:
                    for (int i = 1; i <= 8 ; i++) {
                        if (i == 6){
                            continue;
                        }
                        deck.push (WhotCard.creatingAStarCard (i));
                    }
                    break;
                case SQUARE:
                    for (int i = 1; i <= 14 ; i++) {
                        if (i == 4 || i == 6 || i == 8 || i == 9 || i == 12){
                            continue;
                        }
                        deck.push (WhotCard.creatingASquareCard (i));
                    }
                    break;
                case CROSS:
                    for (int i = 1; i <= 14 ; i++) {
                        if (i == 4 || i == 6 || i == 8 || i == 9 || i == 12){
                            continue;
                        }
                        deck.push (WhotCard.creatingACrosseCard (i));
                    }
                    break;
                case WHOT:
                    for (int i = 1; i <= 5 ; i++) {
                        deck.push (WhotCard.creatingAWhotCard (20));
                    }
                default:break;

            }
        }
        return deck;
    }

}
