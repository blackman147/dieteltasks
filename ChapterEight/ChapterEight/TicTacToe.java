package ChapterEight;

public class TicTacToe {
    private final char [][] gameBoard = new char[3][3];


    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    public String visualizeGameBoard() {
        StringBuilder gameBoardString = new StringBuilder("|");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoardString.append(gameBoard[i][j]).append("|");
            }

            if (i != 2){
                gameBoardString.append("\n|");
            }
        }
        return gameBoardString.toString();
    }

    public void playMove(int playPosition) {
       int row = (playPosition - 1)/ 3;
       int column =(playPosition -1) % 3;
       if (gameBoard[row][column] == ' ')
           gameBoard[row][column] = 'X';

    }

    public boolean hasEnded() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == ' ')
                    return false;

            }

        }
        return true;
    }

    public void playMoveTwo(int playPosition) {
        int row = (playPosition - 1)/ 3;
        int column =(playPosition -1) % 3;
        if (gameBoard[row][column] == ' ')
            gameBoard[row][column] = ' ';
    }

//    public void checkWinner() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameBoard[i][j] == )
//
//            }
//
//        }
//
//
//    }

}
