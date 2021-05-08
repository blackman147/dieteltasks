package chapterFiveTest;

import ChapterFive.GlobalWarming;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GlobalWarmingQuizTest {
    GlobalWarming globalWarming;

    @BeforeEach
    void startWithThis() {
        globalWarming = new GlobalWarming();
    }

    @Test
    void testThatQuestionCanBeDisplayed() {
        assertEquals("""
                Which of these is a green house gas?
                A. methane
                B. Oxygen
                C. Nitrogen dioxide
                D. chloro-fluorocarbon
                """, globalWarming.displayQuestion(1));
    }

    @Test
    void testThatQuestionTwoCanBeDisplayed() {
        assertEquals("""
                What is the largest source of Natural Gas?
                A. Human Feaces
                B. Bovine Feaces
                C. Natural Gas
                D. Landfill
                """, globalWarming.displayQuestion(2));
    }

    @Test
    void testThatQuestionThreeCanBeDisplayed() {
        assertEquals("""
                According to the Sustainable Development Goal 13, the biggest threat towards development is:
                a) Climate change
                b) Pollution
                c) Melting Polar Ice-Caps
                d) Population Growth
                """, globalWarming.displayQuestion(3));
    }

    @Test
    void testThatQuestionFourCanBeDisplayed() {
        assertEquals("""
                Reducing the amount of future climate change is called:      
                A. Mitigation     
                B. Geo- engineering
                C. Adaptation            
                D. None of these           
                """, globalWarming.displayQuestion(4));
    }

    @Test
    void testThatQuestionFiveCanBeDisplayed() {
        assertEquals("""
                Greenhouse effect refers to:
                A. Ability of atmosphere to retain water vapor                
                B. Ability of certain atmospheric gases to trap heat and keep the planet relatively warm                   
                C. Ability of cloud to scatter electromagnetic radiation               
                D. None of the above         
                """, globalWarming.displayQuestion(5));
    }


    @Test
    void testThatUserCanSelectAnswer() {
        assertEquals("""
                Which of these is a green house gas?
                A. methane
                B. Oxygen
                C. Nitrogen dioxide
                D. chloro-fluorocarbon
                """, globalWarming.displayQuestion(1));
        globalWarming.answerSelected("A", 1);
        assertEquals("A", globalWarming.getSelectedAnswer());

        assertEquals("""
                What is the largest source of Natural Gas?
                A. Human Feaces
                B. Bovine Feaces
                C. Natural Gas
                D. Landfill
                """, globalWarming.displayQuestion(2));
        globalWarming.answerSelected("B", 2);
        assertEquals("B", globalWarming.getSelectedAnswer());

        assertEquals("""
                According to the Sustainable Development Goal 13, the biggest threat towards development is:
                a) Climate change
                b) Pollution
                c) Melting Polar Ice-Caps
                d) Population Growth
                """, globalWarming.displayQuestion(3));
        globalWarming.answerSelected("A", 3);
        assertEquals("A", globalWarming.getSelectedAnswer());

        assertEquals("""
                Reducing the amount of future climate change is called:      
                A. Mitigation     
                B. Geo- engineering
                C. Adaptation            
                D. None of these           
                """, globalWarming.displayQuestion(4));
        globalWarming.answerSelected("A", 4);
        assertEquals("A", globalWarming.getSelectedAnswer());

        assertEquals("""
                Greenhouse effect refers to:
                A. Ability of atmosphere to retain water vapor                
                B. Ability of certain atmospheric gases to trap heat and keep the planet relatively warm                   
                C. Ability of cloud to scatter electromagnetic radiation               
                D. None of the above         
                """, globalWarming.displayQuestion(5));
        globalWarming.answerSelected("B", 5);
        assertEquals("B", globalWarming.getSelectedAnswer());
    }



    @Test
    void testThatCorrectAnswerCanBeGraded() {
        assertEquals("""
                Which of these is a green house gas?
                A. methane
                B. Oxygen
                C. Nitrogen dioxide
                D. chloro-fluorocarbon
                """, globalWarming.displayQuestion(1));
        globalWarming.answerSelected("A", 1);
        globalWarming.gradeUser(1, "A");
        assertEquals(1, globalWarming.getScores());

        assertEquals("""
                What is the largest source of Natural Gas?
                A. Human Feaces
                B. Bovine Feaces
                C. Natural Gas
                D. Landfill
                """, globalWarming.displayQuestion(2));
        globalWarming.answerSelected("B", 2);
        globalWarming.gradeUser(2, "B");
        assertEquals(2, globalWarming.getScores());

        assertEquals("""
                According to the Sustainable Development Goal 13, the biggest threat towards development is:
                a) Climate change
                b) Pollution
                c) Melting Polar Ice-Caps
                d) Population Growth
                """, globalWarming.displayQuestion(3));
        globalWarming.answerSelected("A", 3);
        globalWarming.gradeUser(3, "A");
        assertEquals(3, globalWarming.getScores());

        assertEquals("""
                Reducing the amount of future climate change is called:      
                A. Mitigation     
                B. Geo- engineering
                C. Adaptation            
                D. None of these           
                """, globalWarming.displayQuestion(4));
        globalWarming.answerSelected("A", 4);
        globalWarming.gradeUser(4, "A");
        assertEquals(4, globalWarming.getScores());

        assertEquals("""
                Greenhouse effect refers to:
                A. Ability of atmosphere to retain water vapor                
                B. Ability of certain atmospheric gases to trap heat and keep the planet relatively warm                   
                C. Ability of cloud to scatter electromagnetic radiation               
                D. None of the above         
                """, globalWarming.displayQuestion(5));
        globalWarming.answerSelected("B", 5);
        globalWarming.gradeUser(5, "B ");
        assertEquals(5, globalWarming.getScores());

    }


}


