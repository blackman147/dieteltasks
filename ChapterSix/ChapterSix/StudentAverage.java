package ChapterSix;

public class StudentAverage {
    public static int studentAverage(double average){
        int score=0;
        if(average>=0 && average<=100){
            if (average>=90){
                score=4;
            }
            else if (average >=80){
                score=3;
            }
            else if (average>=70){
                score=2;
            }
            else if (average>=60){
                score=1;
            }
            else score=0;
        }else System.out.println("Invalid Average Score");
        return  score;
    }

    public static void main(String[] args) {
        System.out.println(studentAverage(91.2));
    }
}
