package ChapterFive;

import java.util.Scanner;

public class GlobalWarming {

    private String userAnswer;
    private int scores = 0;

    public String displayQuestion(int questionNumber) {
             String question = switch (questionNumber) {
                 case 1 -> questionOne();
                 case 2 -> questionTwo();
                 case 3 -> questionThree();
                 case 4 -> questionFour();
                 case 5 -> questionFive();
                 default -> " ";
             };
        return question;

    }

    public String questionOne(){
        return   """
                Which of these is a green house gas?
                A. methane
                B. Oxygen
                C. Nitrogen dioxide
                D. chloro-fluorocarbon
                """;
    }

    public String questionTwo(){
        return """
                What is the largest source of Natural Gas?
                A. Human Feaces
                B. Bovine Feaces
                C. Natural Gas
                D. Landfill
                """;
    }

    public String questionThree(){
        return """
                According to the Sustainable Development Goal 13, the biggest threat towards development is:
                a) Climate change
                b) Pollution
                c) Melting Polar Ice-Caps
                d) Population Growth
                """;
    }

    public String questionFour(){
        return """
                Reducing the amount of future climate change is called:      
                A. Mitigation     
                B. Geo- engineering
                C. Adaptation            
                D. None of these  
                """;
    }

    public String questionFive(){
        return """
                Greenhouse effect refers to:
                A. Ability of atmosphere to retain water vapor                
                B. Ability of certain atmospheric gases to trap heat and keep the planet relatively warm                   
                C. Ability of cloud to scatter electromagnetic radiation               
                D. None of the above  
                """;
    }

    public void answerSelected(String option, int questionNumber) {
        userAnswer = option;

    }

    public String getSelectedAnswer() {
        return userAnswer;
    }

    public void gradeUser(int questionNumber, String userAnswer){
        boolean isCorrect;
        if (questionNumber == 1){
            isCorrect = userAnswer == "A" || userAnswer == "a";
            if(isCorrect)
            scores++;
        } else if (questionNumber == 2) {
            isCorrect = userAnswer == "B" || userAnswer == "b";
            if(isCorrect)
            scores++;
        } else if (questionNumber == 3){
            isCorrect = userAnswer == "A" || userAnswer == "a";
            if(isCorrect)
                scores++;
        } else if (questionNumber == 4){
            isCorrect = userAnswer == "A" || userAnswer == "a";
            if(isCorrect)
                scores++;
        }else if (questionNumber == 5){
            isCorrect = userAnswer == "B" || userAnswer == "b";
            if(isCorrect)
                scores++;
        }
    }


    public int getScores() {
        return scores;
    }

    public String feedBack(){
        String feedBack = " ";
        if (scores == 5){
            feedBack = "Excellent";
        }else if (scores == 4){
            feedBack = "Very Good";
        }else if (scores <= 3){
            feedBack = "Time to brush up on your knowledge of global warming";
        }
        return feedBack;
    }

    public static void main(String[] args) {
        GlobalWarming globalWarming = new GlobalWarming();
        Scanner  input = new Scanner(System.in);
        for (int questionNumber = 1; questionNumber <= 5 ; questionNumber++) {
            System.out.println(globalWarming.displayQuestion(questionNumber));
            String userInput = input.next();
            globalWarming.gradeUser(questionNumber, userInput);

        }
        System.out.println(globalWarming.feedBack());
    }
}
