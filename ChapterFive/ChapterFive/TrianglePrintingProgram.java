package ChapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");

            }
            System.out.println("*");
        }
        System.out.println();

        int  stars = 10;
        for (int i = 10; i > 0 ; i--) {
            for (int j = 1; j < stars; j++) {
                System.out.print("* ");

            }
            System.out.println("*");
            stars--;
        }
        System.out.println();



         stars = 10;
         int space = 0;
        for (int i = 0; i < 10; i++) {
            for (int f = space; f > 0; f--){
                System.out.print(" ");
            }
            space++;
            for (int j = stars; j > 0 ; j--) {
                System.out.print("*");
            }
            stars--;
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            
            for (space =10; space > i; space--){
                System.out.print(" ");
            }

            for (stars = 0; stars < i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
