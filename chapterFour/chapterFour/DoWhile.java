package chapterFour;

public class DoWhile {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.printf("%d ", count);
            ++count;
        }
        while (count <= 10);
        System.out.println();
    }
}
