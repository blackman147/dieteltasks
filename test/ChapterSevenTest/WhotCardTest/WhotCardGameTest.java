package ChapterSevenTest.WhotCardTest;

import ChapterSevenTest.CardGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WhotCardGameTest {
    @Test
    void  cardGameCanBeCreated(){

        WhotCardGame cardGame = new WhotCardGame (2,5);
        assertNotNull(cardGame);
    }

    @Test
    void gameIsInitializedWithNumberOfPlayers(){
        CardGame cardGame = new CardGame(2, 5);
        assertEquals(2, cardGame.getNumberOfPlayers());
    }

}
