package ChapterFourTest;

import chapterFour.SalesCommissions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionsTest {
    SalesCommissions sales;
    @BeforeEach
    void startWithThis(){
         sales = new SalesCommissions();
    }

    @Test
    void priceCanBeSet(){
        sales.setPrice(350.00);
        assertEquals(350.00, sales.getPrice());
    }

    @Test
    void theTotalOfMultiplePriceCanBeObtained(){
        sales.setPrice(350.00);
        assertEquals(350.00, sales.getPrice());
        sales.setPrice(500.00);
        assertEquals(500.00, sales.getPrice());
        assertEquals(850.00, sales.getTotalAdditionOfPrice());
    }

    @Test
    void ninePercentOfTotalOfTheMultiplePriceCanBeObtained(){
        sales.setPrice(350.00);
        assertEquals(350.00, sales.getPrice());
        sales.setPrice(500.00);
        assertEquals(500.00, sales.getPrice());
        sales.setPrice(850.00);
        assertEquals(850.00, sales.getPrice());
        assertEquals(1700.00, sales.getTotalAdditionOfPrice());
        sales.calculateNinePercentOfTotalPrice();
        assertEquals(153.00, sales.calculateNinePercentOfTotalPrice());
    }

    @Test
    void employeeCannotInputNegativeValue(){
        sales.setPrice(-200.00);
        assertEquals(0.00, sales.getPrice());
        assertEquals(0.00, sales.getTotalAdditionOfPrice());

    }

    @Test
    void employeeSalaryForAMonthCanBeCalculated(){
         sales.setSalaryForTheMonth(200.00);
         assertEquals(200.00,sales.getSalaryForTheMonth());
    }

    @Test
    void employeeTotalSalaryForTheMonthCanBeCalculated(){
        sales.setSalaryForTheMonth(200.00);
        assertEquals(200.00,sales.getSalaryForTheMonth());

        sales.setPrice(350.00);
        assertEquals(350.00, sales.getPrice());
        sales.setPrice(500.00);
        assertEquals(500.00, sales.getPrice());
        sales.setPrice(850.00);
        assertEquals(850.00, sales.getPrice());
        assertEquals(1700.00, sales.getTotalAdditionOfPrice());
        sales.calculateNinePercentOfTotalPrice();
        assertEquals(153.00, sales.calculateNinePercentOfTotalPrice());

        sales.calculateTotalSalaryForTheMonth();
        assertEquals(353.00, sales.calculateTotalSalaryForTheMonth());
    }


}
