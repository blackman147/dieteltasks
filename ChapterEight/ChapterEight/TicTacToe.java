package ChapterEight;

public class TicTacToe {
    private final char[] gameBoard;


    public TicTacToe() {
        gameBoard = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    }

    public String visualizeGameBoard() {
        StringBuilder gameBoardString = new StringBuilder("|");
        for (int i = 0; i < 9; i++) {
            gameBoardString.append(gameBoard[i]).append("|");
            if ((i + 1) % 3 == 0 && i != 8){
                gameBoardString.append("\n|");
            }
        }
        return gameBoardString.toString();
    }

    public void playMove(int playPosition) {
        if (gameBoard[playPosition -1] == ' ')
            gameBoard[playPosition - 1] ='X';
    }
}
