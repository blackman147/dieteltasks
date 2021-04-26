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
        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
    }
    @Test
    void twoUsersCanPlayGame(){
        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(5);
        assertEquals("|X| | |\n| |O| |\n| | | |", ticTacToe.visualizeGameBoard());
    }

    @Test
    void usersCanPlayGameMultipleTimes(){
        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playerTwo(6);
        assertEquals("|X| | |\n| | |O|\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playerOne(7);
        assertEquals("|X| | |\n| | |O|\n|X| | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playerTwo(3);
        assertEquals("|X| |O|\n| | |O|\n|X| | |", ticTacToe.visualizeGameBoard());
    }

    @Test
    void gameCanOnlyAllowUserPlayInEmptySpaces(){
        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
    }
    @Test
    void gameKnowsWhenTheBoardHasNoEmptySpace(){
        assertFalse(ticTacToe.hasEnded());

        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());

        ticTacToe.playerOne(2);
        assertEquals("|X|X| |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(3);
        assertEquals("|X|X|X|\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(4);
        assertEquals("|X|X|X|\n|X| | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(5);
        assertEquals("|X|X|X|\n|X|X| |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(6);
        assertEquals("|X|X|X|\n|X|X|X|\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(7);
        assertEquals("|X|X|X|\n|X|X|X|\n|X| | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(8);
        assertEquals("|X|X|X|\n|X|X|X|\n|X|X| |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(9);
        assertEquals("|X|X|X|\n|X|X|X|\n|X|X|X|", ticTacToe.visualizeGameBoard());

        ticTacToe.playerOne(1);
        assertTrue(ticTacToe.hasEnded());
    }


    @Test
    void usersCanWinOnASingleColumn(){
        ticTacToe.playerOne(1);
        assertEquals("|X| | |\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(3);
        assertEquals("|X| |O|\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(4);
        assertEquals("|X| |O|\n|X| | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(8);
        assertEquals("|X| |O|\n|X| | |\n| |O| |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(7);
        assertEquals("|X| |O|\n|X| | |\n|X|O| |", ticTacToe.visualizeGameBoard());

        ticTacToe.checkWinner();
        assertEquals("X",ticTacToe.getWinner());
    }

    @Test
    void usersCanWinDiagonally(){
        ticTacToe.playerOne(3);
        assertEquals("| | |X|\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(1);
        assertEquals("|O| |X|\n| | | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(4);
        assertEquals("|O| |X|\n|X| | |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(5);
        assertEquals("|O| |X|\n|X|O| |\n| | | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerOne(7);
        assertEquals("|O| |X|\n|X|O| |\n|X| | |", ticTacToe.visualizeGameBoard());
        ticTacToe.playerTwo(9);
        assertEquals("|O| |X|\n|X|O| |\n|X| |O|", ticTacToe.visualizeGameBoard());

        ticTacToe.checkWinner();
        assertEquals("O",ticTacToe.getWinner());
    }



}
