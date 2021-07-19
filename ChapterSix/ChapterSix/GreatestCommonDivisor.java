package ChapterSix;

public class GreatestCommonDivisor {



        public static int greatestCommonDivisor(int firstNumber,int secondNumber){
            int GCD=1;
            int counter=2;
            while(counter<=firstNumber&&counter<=secondNumber){
                if(firstNumber%counter==0&&secondNumber%counter==0)
                    GCD=counter;
                counter++;


            }
            return GCD;
        }
        public static void main(String[] args) {
            System.out.println(greatestCommonDivisor(100,80));
        }
}
