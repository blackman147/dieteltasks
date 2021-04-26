package ChapterEight;

public class TicTacToe {
    private final char [][] gameBoard = new char[3][3];
    private String winner;

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

    public void playerOne(int playPosition) {
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

    public void playerTwo(int playPosition) {
        int row = (playPosition - 1)/ 3;
        int column =(playPosition -1) % 3;
        if (gameBoard[row][column] == ' ')
            gameBoard[row][column] = 'O';
    }

    public void checkWinner() {

                    if (gameBoard[0][0] == 'X' && gameBoard[1][0]=='X' && gameBoard[2][0]=='X' ){
                        winner = "X";
                    }
                    else
                        if (gameBoard[0][0] == 'X' && gameBoard[0][1]=='X' && gameBoard[0][2]=='X'){
                            winner = "X";
                    }
                    else
                        if (gameBoard[1][0] == 'X' && gameBoard[1][1]=='X' && gameBoard[2][1]=='X'){
                            winner = "X";
                     }
                    else
                        if(gameBoard[2][0] == 'X' && gameBoard[2][1]=='X' && gameBoard[2][2]=='X'){
                            winner = "X";
                         }
                    else
                        if (gameBoard[0][1] == 'X' && gameBoard[1][1]=='X' && gameBoard[2][1]=='X'){
                            winner = "X";
                        }
                    else
                        if (gameBoard[0][2] == 'X' && gameBoard[1][2]=='X' && gameBoard[2][2]=='X'){
                            winner = "X";
                        }
                    else
                        if (gameBoard[0][0] == 'O' && gameBoard[1][0]=='O' && gameBoard[2][0]=='O' ){
                    winner = "O";
                    }
                    else
                        if (gameBoard[0][0] == 'O' && gameBoard[0][1]=='O' && gameBoard[0][2]=='O'){
                        winner = "O";
                     }
                    else
                        if (gameBoard[1][0] == 'O' && gameBoard[1][1]=='O' && gameBoard[2][1]=='O'){
                        winner = "0";
                    }
                    else
                         if(gameBoard[2][0] == 'O' && gameBoard[2][1]=='O' && gameBoard[2][2]=='0') {
                             winner = "0";
                         }
                    else
                        if (gameBoard[0][1] == 'O' && gameBoard[1][1]=='O' && gameBoard[2][1]=='O'){
                        winner = "O";
                    }
                    else
                        if (gameBoard[0][2] == 'O' && gameBoard[1][2]=='O' && gameBoard[2][2]=='O'){
                        winner = "O";
                    }
                    else
                        if (gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X'){
                            winner = "X";
                        }
                    else
                        if (gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O'){
                            winner = "O";
                        }

                    else
                        if (gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X'){
                            winner = "X";
                        }
                    else
                        if (gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O'){
                            winner = "O";
                        }


    }

    public String getWinner() {
        return winner;
    }
}





