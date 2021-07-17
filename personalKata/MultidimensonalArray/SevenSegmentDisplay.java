package MultidimensonalArray;

public class Classwork2 {
    public void sevenSegmentDisplay(int [] [] values) throws InterruptedException {

        for (int i = 0; i <= values.length-1 ; i++) {
            for (int j = 0; j <= values[i].length-1 ; j++) {
                if (values[i][j] == 1){

                    System.out.print ("# " );
                }else
                    System.out.print ("  " );
                Thread.sleep (1000);

            }
            System.out.println ( );
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Classwork2 work = new Classwork2 ();
        int[][] values = {{1,1,1,1},{1,0,0,1},{1,1,1,1},{1,0,0,1},{1,1,1,1}};
        work.sevenSegmentDisplay (values);

    }
}
