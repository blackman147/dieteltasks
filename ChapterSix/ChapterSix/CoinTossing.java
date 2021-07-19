package ChapterSix;

import java.security.SecureRandom;

public class CoinTossing {
    public static int scoreHead=0;
    public static int scoreTail=0;
    private  static CoinStatus coinStatus;
    public static CoinStatus coinTossing(){
        int counter=0;
        SecureRandom secureRandom=new SecureRandom();

        while(counter<10){
            int random=secureRandom.nextInt(2);
            if (random==1){
                coinStatus=CoinStatus.HEAD;
                scoreHead++;
            }
            else coinStatus=CoinStatus.TAIL;
            scoreTail++;

            counter++;
            System.out.println(coinStatus);
        }
        return coinStatus;
    }
    public static String flip(){
        System.out.println(scoreHead+" is the number of time(s) you got Head");
        System.out.println(scoreTail-scoreHead+" is the number of time(s) you got Tail");
        return "";
    }

    public static void main(String[] args) {
        System.out.println(coinTossing());
        System.out.println(flip());
    }
}
