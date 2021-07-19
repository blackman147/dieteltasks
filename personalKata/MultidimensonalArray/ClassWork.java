package MultidimensonalArray;

import java.util.Arrays;

public class ClassWork {
    public void multidimensionalArray(char [][] tictactoe) throws InterruptedException {



        for (int i = 0; i <= tictactoe.length-1 ; i++) {
            for (int j = 0; j <= tictactoe[i].length-1 ; j++) {
                System.out.print ( tictactoe[i][j] + " |" );
                Thread.sleep (1000);
            }
            System.out.println ( );
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ClassWork work = new ClassWork ();
        char [][] tictactoe = {{'X' ,'O' , 'X'},{'O' , 'O', 'X'}, {'O', 'X', 'O'}};
        work.multidimensionalArray (tictactoe);
    }
}
