package ChapterSevenTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {

    @Test
    void  cardGameCanBeCreated(){

        CardGame cardGame = new CardGame(2, 5);
        assertNotNull(cardGame);
    }

    @Test
    void gameIsInitializedWithNumberOfPlayers(){
        CardGame cardGame = new CardGame(2, 5);
        assertEquals(2, cardGame.getNumberOfPlayers());
    }
}
