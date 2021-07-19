package chapterFifteen.StudentPoll;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

    public static void writeToFile(){

        try(Formatter formatter =
                    new Formatter ("chapterFifteen/chapterFifteen/numbers.txt");
            Scanner input = new Scanner (System.in);

        ){
            System.out.println ("Enter Student Responses ENTER + CONTROL + D to Exit");

            while (input.hasNext ()){

                formatter.format ( "%d ", input.nextInt (  ) );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }

    public static int[] processSurveyResponses(){
        int [] frequency = new int[6];
        try(Scanner input = new Scanner (Paths.get("chapterFifteen/chapterFifteen/numbers.txt"));
            Formatter output = new Formatter ( "chapterFifteen/chapterFifteen/output.txt" );
            ) {
                while (input.hasNextInt ( )){
                    int answer = input.nextInt ();
                    try
                    {
                        ++frequency[answer];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println (e );
                    }
                }
        }
        catch (IOException e) {
            e.printStackTrace ( );
        }
        return frequency;
    }

    public static void writeSurveyFrequency(int [] frequency) {
    try(Formatter output = new Formatter ( "chapterFifteen/chapterFifteen/output.txt" );
    ){
        output.format("%s%10d%n", "Rating", "Frequency");
        for (int i = 1; i < frequency.length ; i++) {
            System.out.printf ("%d%10d%n", i, frequency[i] );
        }
    } catch (FileNotFoundException e) {
         e.printStackTrace ( );
        }
    }

    public static void main(String[] args) {
//        StudentPoll student = new StudentPoll ();
        writeToFile ();
//        int [] frequency = processSurveyResponses ();
//        writeSurveyFrequency (frequency);

    }
}
