import java.util.Locale;

public class Occurrence {
    public int numberOfCharOccurrence(String sentence, char  character){
        sentence = sentence.toLowerCase();
        character = Character.toLowerCase(character);
        int numberOfOccurrence = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (character == sentence.charAt(i))
                numberOfOccurrence++;

        }
        return numberOfOccurrence;

    }

    public int numberOfStringOccurrence(String sentence, String subSentence){
        sentence = sentence.toLowerCase();
        subSentence = subSentence.toLowerCase();
        int numberOfOccurrence = 0;
        int length = subSentence.length();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.regionMatches(i, subSentence, 0, length))
                numberOfOccurrence++;

        }
        return numberOfOccurrence;
    }

    public static void main(String[] args) {
        Occurrence occurrence = new Occurrence();
        System.out.println(occurrence.numberOfCharOccurrence("Jibolaaaaa stole my plantaaaaain from my food", 'a' ));
        System.out.println(occurrence.numberOfStringOccurrence("wasiu no gree come school again", "school"));
    }
}
