package ChapterFive;

public class DiamondPrinting {
    public static void main(String[] args) {

            int spaces = 9;
            int star = 1;

            for(int i = 0; i < 5; i++){
                for(int s = spaces; s > 0; s--){
                    System.out.print(" ");
                }
                for(int a = star; a > 0; a--){
                    System.out.print("* ");
                }
                System.out.println();
                spaces -=2; star +=2;
            }
            for(int i = 0; i < 6; i++){
                for(int s = spaces; s > 0; s--){
                    System.out.print(" ");
                }
                for(int a = star; a > 0; a--){
                    System.out.print("* ");
                }
                System.out.println();
                spaces +=2; star -=2;
            }

    }


}
