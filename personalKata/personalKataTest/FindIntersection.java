 package personalKataTest;

public class FindIntersection {
    public static String findIntersection(){
        String [] input = {"0, 3, 5, 7, 14", "1, 2, 4, 13, 15"};
        String [] firstElement = input[0].split(", ");
        String [] secondElement = input [1]. split(", ");
        String commonElement = "";

        for (int i = 0; i < firstElement.length; i++) {
            for (int j = 0; j < secondElement.length ; j++) {
                if (firstElement[i].equalsIgnoreCase(secondElement[j])){
                    commonElement += firstElement[i] + ", ";
                }
            }
        }
         if (commonElement.length () == 0) {
        return "false ";
         }
        return commonElement + " ";
    }
    public static void main(String[] args) {
        System.out.println (findIntersection () );
    }

}
