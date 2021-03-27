package ChapterSix;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        int counter = 0;
        int i = 0;
//
//        for (int counter = 0; counter < array.length;) {
//            array[counter] = ++counter;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
        while( counter < array.length){
            array [counter] = ++counter;
        }
        while(i < array.length && i <= 5){

                System.out.println(array[i]);
            i++;

        }



    }
}
