package PersonalKata;

public class PracticeMethod {

    public static int sum(int i1, int i2){
        int result = 0;
        for (int i = i1; i <= i2 ; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum of 1 to 10 is: " + sum(1,10));
        System.out.println("sum of 20 to 31 is: " + sum(20,31));
        System.out.println("sum of 35 to 49 is: " + sum(35,49));
    }
}
