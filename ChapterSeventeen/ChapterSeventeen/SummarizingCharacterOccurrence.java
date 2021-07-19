package ChapterSeventeen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SummarizingCharacterOccurrence {

    public static void writeToFile(){
        Scanner input = new Scanner ( System.in );
        try(Formatter formatter = new Formatter ("ChapterSeventeen/ChapterSeventeen/words.txt")){
            System.out.println ("Enter Student Responses ENTER + CONTROL + D to Exit");
            formatter.format ( "%s", "Student Responses: " );

            while (input.hasNext ()){
                int studentResponses = input.nextInt ();
                formatter.format ( "%d %s", studentResponses, " " );
            }

        } catch ( FileNotFoundException e) {
            e.printStackTrace ();
        }
    }
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile (" ");

        Map<String, Long> wordCounts =
                Files.lines (Paths.get ("ChapterSeventeen/ChapterSeventeen/words.txt"))
                        .map (line -> line.replaceAll ("(?!')\\p{P}", ""))
                        .flatMap (line -> pattern.splitAsStream (line))
                        .collect (Collectors.groupingBy (String::toLowerCase, TreeMap::new,
                                Collectors.counting ( )));

        wordCounts.entrySet ( )
                .stream ( )
                .collect (
                        Collectors.groupingBy (entry -> entry.getKey ( ).charAt (0),
                                TreeMap::new, Collectors.toList ( )))
                .forEach ((letter, wordList) ->
                {
                    System.out.printf ("%n%C%n", letter);
                    wordList.stream ( ).forEach (word -> System.out.printf (
                            "%13s: %d%n", word.getKey ( ), word.getValue ( )));

                });
    }
}
