package PersonalKata.compare;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringCompare {
    public static String largestAndSmallest(String word, int num){
        String largest = "";
        String smallest = word.substring (0, num);
        for(int i = 0; i < word.length ()-num+1; i++){
            var substring = word.substring (i, num + i);
            if (word.substring (i, num+i).compareTo (smallest) < 0){
                smallest = substring;
            }
            if (word.substring (i, num+i).compareTo (largest) > 0){
                largest = substring;
            }
        }
        return  smallest+ "\n"+largest ;
    }

    public static String largestAndSmallestSubStringWithSet(String word, int num){
        String smallest = "";
        String largest = "";

        SortedSet<String> letter = new TreeSet<> (  );
        for (int i = 0; i < word.length ()- num + i; i++){
            letter.add (word.substring (i, num+i));
        }
        smallest = letter.first ();
        largest = letter.last ();

        return smallest+"\n"+largest;
    }

    public static void main(String[] args) {
        System.out.println ( largestAndSmallest ("welcometojava", 3));
    }

}
