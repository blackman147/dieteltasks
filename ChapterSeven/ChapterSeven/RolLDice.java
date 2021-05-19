package ChapterSeven;

import java.security.SecureRandom;

public class RolLDice {
    SecureRandom generator;
    public int getFace() {
        int faceRandom = 0;
         generator = new SecureRandom();
        faceRandom = 1 + generator.nextInt(6);
        return faceRandom;
    }


    public int countGeneratedFace(int generatedFace) {
       int [] array = new int[6];
       array[generatedFace - 1]++;

       return array[generatedFace -1];




    }

}
