package ChapterSix;

import java.util.Scanner;

public class Temperature {


        public static String fahrenheit(double celsius) {
            return 9.0 / 5.0 * celsius + 32+"F";
        }

        public static String  celsius(double fahrenheit) {
            return 5.0 / 9.0 * (fahrenheit - 32)+" C";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                Press 1 for celsius conversion
                Press 2 for Fahrenheit conversion
                Press -1 to terminate
                """);
            System.out.println("Enter you preferred temperature Scale");
            int scale = sc.nextInt();
            switch (scale) {
                case 1 -> {
                    System.out.println("Enter you celsius value");
                    int celsius = sc.nextInt();
                    System.out.println(fahrenheit(celsius));
                }
                case 2 -> {
                    System.out.println("Enter you fahrenheit value");
                    int fahrenheit = sc.nextInt();
                    System.out.println(celsius(fahrenheit));
                }
                default -> System.out.println("sorry you entered the wrong value");
            }

        }

}
