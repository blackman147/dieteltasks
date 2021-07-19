package com.blackie;

import ChapterSix.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueCharacter {
    public char[] getUniqueOccurrence(String word){
//        1, spell the word out and seperate each alphabet
        char[] array = word.toCharArray ();
//        char[] characters = new char[word.length ()];
//        for (int i = 0; i < characters.length; i++) {
//            characters[i] = word.charAt (i);
//        }
        return  array;
    }

    public String getOccurrence(char[] wordCharacters){
        //        2, count how many times each alphabet occurs in the word
            int[] allCharacters = new int[255];

        for (int i = 0; i < wordCharacters.length; i++) {
            int characterValue = wordCharacters[i];
            if (allCharacters[characterValue] == 0){
                allCharacters[characterValue] = 1;
            }else{
                allCharacters[characterValue] += 1;
            }
        }
        StringBuilder stringBuilder = getStringBuilder (wordCharacters, allCharacters);

        return  stringBuilder.toString ();

    }

    private StringBuilder getStringBuilder(char[] wordCharacters, int[] allCharacters) {
        StringBuilder stringBuilder = new StringBuilder ();
        int counter = 0;
        List<String> values = new ArrayList<> ();
        String value = "";
        for (int i = 0; i < wordCharacters.length; i++) {

            int characterValue = wordCharacters[i];
            value = wordCharacters[i] + "----->" + allCharacters[characterValue] + "\n";
            if (!values.contains(value)){
                stringBuilder.append (value);
                values.add(value);
            }

        }
        return stringBuilder;
    }





    public static void main(String[] args) {
        UniqueCharacter character = new UniqueCharacter ();

        char[] arrayOfCharacters = character.getUniqueOccurrence ("BESSIE");

        System.out.println (Arrays.toString (arrayOfCharacters));
        String result = character.getOccurrence (arrayOfCharacters);
        System.out.println (result );
    }
}
