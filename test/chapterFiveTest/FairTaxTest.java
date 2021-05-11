package chapterFiveTest;

import ChapterFive.FairTax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FairTaxTest {

    FairTax tax;

    @BeforeEach
    void startWithThis(){
        tax = new FairTax();
    }

    @Test
    void expenseReportCanBeDisplayed(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());

    }

    @Test
    void userCanSelectReportToFill(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(2);
        assertEquals(2, tax.getSelectedOption());
    }

    @Test
    void userCanSelectMultipleReport(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(2);
        assertEquals(2, tax.getSelectedOption());

        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(5);
        assertEquals(5, tax.getSelectedOption());

    }

    @Test
    void userCanInputExpenseForSelectedOption(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(5);
        assertEquals(5, tax.getSelectedOption());
        tax.expenseForSelectedOption(5);
        assertEquals(35.0, tax.getExpense());
    }

    @Test
    void userCanInputExpenseForMultipleSelectedOption(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(5);
        assertEquals(5, tax.getSelectedOption());
        tax.expenseForSelectedOption(5);
        assertEquals(35.0, tax.getExpense());

        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(2);
        assertEquals(2, tax.getSelectedOption());
        tax.expenseForSelectedOption(2);
        assertEquals(20.35, tax.getExpense());

        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(8);
        assertEquals(8, tax.getSelectedOption());
        tax.expenseForSelectedOption(8);
        assertEquals(5000.00, tax.getExpense());
    }

    @Test
    void totalExpenseCanBeCalculated(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(5);
        assertEquals(5, tax.getSelectedOption());
        tax.expenseForSelectedOption(5);
        assertEquals(35.0, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(35.0, tax.getTotalExpense() );
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(2);
        assertEquals(2, tax.getSelectedOption());
        tax.expenseForSelectedOption(2);
        assertEquals(20.35, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(55.35, tax.getTotalExpense());
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(8);
        assertEquals(8, tax.getSelectedOption());
        tax.expenseForSelectedOption(8);
        assertEquals(5000.00, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(5055.35, tax.getTotalExpense());
    }

    @Test
    void taxCanBeCalculated(){
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(5);
        assertEquals(5, tax.getSelectedOption());
        tax.expenseForSelectedOption(5);
        assertEquals(35.0, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(35.0, tax.getTotalExpense() );
        tax.calculateTax();
        assertEquals(10.5, tax.getCalculatedTax());
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(2);
        assertEquals(2, tax.getSelectedOption());
        tax.expenseForSelectedOption(2);
        assertEquals(20.35, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(55.35, tax.getTotalExpense());
        tax.calculateTax();
        assertEquals(16.605, tax.getCalculatedTax());
        assertEquals("""
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """, tax.displayReport());
        tax.optionSelected(8);
        assertEquals(8, tax.getSelectedOption());
        tax.expenseForSelectedOption(8);
        assertEquals(5000.00, tax.getExpense());
        tax.setTotalExpense();
        assertEquals(5055.35, tax.getTotalExpense());
        tax.calculateTax();
        assertEquals(1516.605, tax.getCalculatedTax());
    }
}
