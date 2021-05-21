package ChapterSevenTest;

import org.junit.jupiter.api.Test;

import static ChapterSevenTest.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void playerHasAnId(){
        Player player = new Player("Blackie");
        assertEquals("Blackie", player.getName());
    }

    @Test
    void playerHasCards(){
        Player player = new Player("Blackie");
        player.addCard(new Card(DIAMOND, 4));
        player.addCard(new Card(SPADES, 2));
        player.addCard(new Card(HEARTS, 7));

        assertEquals(3, player.getNumberOfCards());

    }
}
