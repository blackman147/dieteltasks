package chapterFour;

public class ReDoing {
    public static void main(String[] args) {
        int day;
        for (day = 1; day <= 12; day++) {
            System.out.println("on the day" + day);


            switch (day) {
                case 1 -> System.out.println("st");
                case 2 -> System.out.println("nd");
                case 3 -> System.out.println("rd");
                default -> System.out.println("th");
            }

            System.out.println("day of Christmas my true love sent to me");

            switch (day) {

                case 12:
                    System.out.println("Twelve drummers drumming, ");
                case 11:
                    System.out.println("Eleven pipers piping, ");
                case 10:
                    System.out.println("Ten lords a leaping, ");
                case 9:
                    System.out.println("Nine ladies dancing, ");
                case 8:
                    System.out.println("Eight maids a milking, ");
                case 7:
                    System.out.println("Seven swans a swimming, ");
                case 6:
                    System.out.println("Six geese a laying, ");
                case 5:
                    System.out.println("Five golden rings, ");
                case 4:
                    System.out.println("Four calling birds, ");
                case 3:
                    System.out.println("Three French hens, ");
                case 2:
                    System.out.println("Two turtle doves, and ");
                default:
                    System.out.println("A partridge in a pear tkhree. \n");


            }


        }
    }
}
