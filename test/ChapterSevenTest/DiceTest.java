package ChapterSevenTest;

import ChapterSeven.RolLDice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    RolLDice rolLDice;
    @BeforeEach
    void setUp(){
        rolLDice = new RolLDice();
    }

    @Test
    void diceCanGenerateRandomFace(){
        assertNotEquals(rolLDice.getFace(), rolLDice.getFace());
    }

    @Test
    void diceCanCountRandomFace(){
     assertEquals(1, rolLDice.countGeneratedFace(rolLDice.getFace()));

    }
}
