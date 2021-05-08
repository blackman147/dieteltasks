package ChapterFourteen;

import java.security.SecureRandom;




public class RandomSentences {
    public static void main(String[] args) {
        String[][] words = new String[4][];
        words[0] = new String[]{"the", "a", "one", "some", "any"};
        words[1] = new String[]{"boy", "girls", "dog", "town", "car"};
        words[2] = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        words[3] = new String[]{"to", "from", "over", "under", "on"};
        SecureRandom random = new SecureRandom();

        for (int i = 0; i <= 20; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words.length; j++) {
                sb.append(words[j][random.nextInt(5)]).append(" ");
            }
            System.out.println(sb);
        }


    }
}
