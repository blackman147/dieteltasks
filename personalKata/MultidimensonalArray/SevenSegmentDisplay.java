package MultidimensonalArray;

public class SevenSegmentDisplay {
            int [] [] values = new int[5][4];

            public void display() throws InterruptedException {
                for (int i = 0; i <= values.length-1 ; i++) {
                    for (int j = 0; j <= values[i].length-1 ; j++) {
                        if (values[i][j] == 1){
                            System.out.print ("# ");
                        }else
                            System.out.print ("  ");
                        Thread.sleep (1000);
                    }
                    System.out.println ( );
                }
            }

            public void writeOnA() throws InterruptedException {
                for (int i = 0; i < 4; i++) {
                    values[0][i] = 1;
                }
            }

            public void writeOnB( ) {
                for (int i = 0; i < 3; i++) {
                    values[i][3] = 1;
                }
            }

            public void writeOnC( ) {
                for (int i = 2; i < 5; i++) {
                    values[i][3] = 1;
                }
            }

            public void writeOnD( ) {
                for (int i = 0; i < 4; i++) {
                    values[4][i] = 1;
                }
            }
            public void writeOnE( ) {
                for (int i = 2; i <5 ; i++) {
                    values[i][0] = 1;
                }
            }
            public void writeOnF( ) {
                for (int i = 0; i < 3; i++) {
                    values[i][0] = 1;
                }
            }

            public void writeOnG( ) {
                for (int i = 0; i < 4; i++) {
                    values[2][i] = 1;
                }
            }

            public String setValue(String input) throws InterruptedException {

                if (input.length () > 8){
                    input = input.substring (0,8);
                }else if (input.length () < 8){
                    while(input.length () <= 8){
                        input = '0' + input;
                    }
                }

                if (input.charAt (7) == '0'){
                    return " ";

                }
                for (int i = 0; i <input.length () ; i++) {
                    if (input.charAt (i) != '0' && input.charAt (i) != '1' ){
                        throw new IllegalArgumentException ( "Invalid input. provide the appropriate number " );
                    }
                }


                for (int i = 0; i < input.length (); i++) {
                    if (input.charAt (i) == '1'){
                        switch (i) {
                            case 0 -> writeOnA ( );
                            case 1 -> writeOnB ( );
                            case 2 -> writeOnC ( );
                            case 3 -> writeOnD ( );
                            case 4 -> writeOnE ( );
                            case 5 -> writeOnF ( );
                            case 6 -> writeOnG ( );
                        }

                    }
                }
                return input;
            }

            public int binaryNumber(int decimalNumber){
                int binaryNumber =0;
                int multiplier =1;
                while (decimalNumber > 0){
                    binaryNumber += multiplier * (decimalNumber % 2);
                    decimalNumber/= 2;
                    multiplier *= 10;
                }
                return decimalNumber;
            }

    public static void main(String[] args) throws InterruptedException {
        SevenSegmentDisplay work = new SevenSegmentDisplay ( );
        int[][] values = new int[5][4];
        String input = "10111111";
        work.setValue (input);
        work.display ( );
    }
}
