package chapterFour;

public class KataTest {
    public static void main(String[] args) {
        Kata blackie = new Kata();
        System.out.println("The average is" + blackie.calculateAverage(23, 14, 19));


        System.out.println("Your Grade is: " + blackie.calculateGrade(90));

        System.out.println(blackie.isEven(62));
    }
}
