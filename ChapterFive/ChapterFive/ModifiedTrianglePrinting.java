package ChapterFive;

public class ModifiedTrianglePrinting {
    public static void main(String[] args) {
        int t1 = 1, t2 = 10;
        int spaces1 = 12, spaces2 = 5;

        for (int i = 0; i < 10; i++) {


            for (int a = t1; a > 0; a--) {
                System.out.print("*");
            }

            for (int b = spaces1; b > 0; b--) {
                System.out.print(" ");
            }

            for (int c = t2; c > 0; c--){
                System.out.print("*");
            }

            for (int d = spaces2; d > 0; d-- ){
                System.out.print(" ");
            }

            for (int c = t2; c > 0; c--){
                System.out.print("*");
            }

            for (int b = spaces1; b > 0; b--) {
                System.out.print(" ");
            }

            for (int a = t1; a > 0; a--) {
                System.out.print("*");
            }
            System.out.println();

            t1++; spaces1--; t2--; spaces2+=2;
        }

    }
}
