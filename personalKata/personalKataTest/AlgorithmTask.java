package personalKataTest;

public class AlgorithmTask {
    public static int[] findIndex(int[] arr, int val){
        int[] index = new int[2];
        if (arr == null){
            return index;
        }

        for ( int j = 0; j < arr.length ; j++) {
            if (arr[j] == val){
                arr[j]= index[j];
            }
        }
          return index;
    }
    public static void main(String[] args) {

        int [] array = {0, 8, -2, 5, 0,3,3,3,3};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println ( );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println ( );
        findIndex (array, 3);
    }


}
