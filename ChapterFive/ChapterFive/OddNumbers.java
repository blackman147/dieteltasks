package ChapterFive;

public class OddNumbers {
    public static void main(String[] args) {

        int product = 1;

        for (int i = 1; i <= 15; i++) {
            if(i % 2 == 1){
                product *= i;
            }
        }
        System.out.println("product of odd numbers between 1 and 15 is: " + product);
    }
}
