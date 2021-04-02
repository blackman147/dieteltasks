package ChapterEightTest;

import ChapterEight.TicTacToe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    void StartWithThis() {
        ticTacToe = new TicTacToe();
    }

    @AfterEach
    void teardown() {
        ticTacToe = null;
    }

    @Test
    void gameBoardCanBeVisualized(){
        assertEquals("| | | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
    }

    @Test
    void userCanPlayGame(){
        ticTacToe.playMove(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
    }

    @Test
    void userCanPlayGameMultipleTimes(){
        ticTacToe.playMove(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playMove(6);
        assertEquals("|X| | |\n| | |X|\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playMove(7);
        assertEquals("|X| | |\n| | |X|\n|X| | |", ticTacToe.visualizeGameBoard());
    }

    @Test
    void gameCanOnlyAllowUserPlayInEmptySpaces(){
        ticTacToe.playMove(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
    }
    @Test
    void gameKnowsWhenTheBoardHasNoEmptySpace(){
        assertFalse(ticTacToe.hasEnded());

        ticTacToe.playMove(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playMove(2);
        assertEquals("|X|X| |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(3);
        assertEquals("|X|X|X|\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(4);
        assertEquals("|X|X|X|\n|X| | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(5);
        assertEquals("|X|X|X|\n|X|X| |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(6);
        assertEquals("|X|X|X|\n|X|X|X|\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(7);
        assertEquals("|X|X|X|\n|X|X|X|\n|X| | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(8);
        assertEquals("|X|X|X|\n|X|X|X|\n|X|X| |", ticTacToe.visualizeGameBoard());
        ticTacToe.playMove(9);
        assertEquals("|X|X|X|\n|X|X|X|\n|X|X|X|", ticTacToe.visualizeGameBoard());

        ticTacToe.playMove(1);
        assertTrue(ticTacToe.hasEnded());
    }

}
