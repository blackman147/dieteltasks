package chapterFour;

import java.util.Scanner;

public class Factorial {
     public double factors(int number) {
        int factorial = 1;


        if (number == 0) {
            System.out.println (1 );
        } else if (number == 1) {
            System.out.println (1 );
        } else {
                while (number >= 2){
                     factorial *= number;
                    number --;
                }
        }
         return factorial;
    }

    public double mathConstant(int value){
         double e;
         if (value == 1){
             e = 1 +(1.0/1);
             return e;
         }else if (value == 0){
             e = 1 +1;
             return e;
         }else {
             double factorial = 1;
             while (value >=2){
                 factorial += (1.0 / factors (value));
                 value--;
             }
             return 1+factorial;
         }
    }

    public static void main(String[] args) {
        Factorial facts = new Factorial ();
        System.out.println ("the factorial is: " + facts.factors (10) );
        System.out.println ("the factorial of math constant e is: "+ facts.mathConstant (12) );

    }

}
