package chapterFour;

import java.util.Scanner;

public class Cryptographer {
    public static int encrypt(int message) {
        int encryptedMessage = 0;

        int firstDigit = message/1000;
        firstDigit += 7;
        firstDigit %= 10;

        message = message % 1000;
        int secondDigit =  message/ 100;
        secondDigit +=7;
        secondDigit %= 10;

        message = message % 100;
        int thirdDigit = message / 100;
        thirdDigit += 7;
        thirdDigit %= 10;

        int fourthDigit = message % 10;
        fourthDigit +=7;
        fourthDigit %= 10;

        thirdDigit *= 1000;
        fourthDigit *= 100;
        firstDigit *= 10;

        encryptedMessage =  thirdDigit  + fourthDigit  + firstDigit  + secondDigit;


        return encryptedMessage;
    }

    public  int decryptingMessage(int message){
        int firstDigit=message/1000;
        int secondDigit=(message%1000)/100;
        int thirdDigit=((message%1000)%100)/10;
        int fourthDigit=((((message%1000)%100)%10)%10);
        if(firstDigit<7){
            firstDigit+=10-7;
        }else firstDigit-=7;

        if(secondDigit<7){
            secondDigit+=10-7;
        }else secondDigit-=7;


        if(thirdDigit<7){
            thirdDigit+=10-7;
        }else thirdDigit-=7;

        if(fourthDigit<7){
            fourthDigit+=10-7;
        }else fourthDigit-=7;

        thirdDigit*=1000;
        fourthDigit*=100;
        firstDigit*=10;
        return thirdDigit+fourthDigit+firstDigit+secondDigit;
    }
    public static void main(String[] args) {
        Cryptographer cryptographer = new Cryptographer();
        System.out.println( cryptographer.encrypt(2345));
        System.out.println(cryptographer.decryptingMessage(1290));

    }
}