package ChapterSix;

public class SeparatingDigits {


    public String separateNumbers(int number){
        String stringValue = "";
        while(number > 0){
            int digit = number % 10;
            stringValue = digit + " "+ stringValue;
            number /= 10;
        }
        return stringValue;
    }
    public int division(){
        int a = 53;
        int b = 11;
        int divide = a / b;
        return divide;
    }

    public int modulo(){
        int a = 53;
        int b = 11;

        int remainder = a % b;
        return remainder;
    }

    public static void main(String[] args) {
        SeparatingDigits separatingDigits = new SeparatingDigits();
        System.out.println(separatingDigits.division());
        System.out.println(separatingDigits.modulo());
        System.out.println(separatingDigits.separateNumbers(34678));
    }
}
