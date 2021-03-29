package ChapterFourTest;

import chapterFour.Salary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {
    Salary salary;

    @BeforeEach
    void startWithThis(){
        salary = new Salary();
    }

    @Test
    void employeeNameCanBeSet(){
        salary.employeeName("Blackie", "GoodMan");
        assertEquals("Blackie GoodMan", salary.getEmployeeName() );
    }

    @Test
    void employeeNamesCanBeSetMultipleTimes(){
        salary.employeeName("Blackie", "GoodMan");
        assertEquals("Blackie GoodMan", salary.getEmployeeName() );

        salary.employeeName("Dami", "lawal");
        assertEquals("Dami lawal", salary.getEmployeeName() );
    }


    @Test
    void employeeHourlyRatesCanBeUsedToCalculateSalary(){
        salary.employeeName("Blackie", "GoodMan");
        assertEquals("Blackie GoodMan", salary.getEmployeeName() );
        salary.setHourlyRates(50);
        assertEquals(50, salary.getHourlyRates());
    }

    @Test
    void employeeCanBePaidAfterFortyHours(){
        salary.employeeName("Blackie", "GoodMan");
        assertEquals("Blackie GoodMan", salary.getEmployeeName() );

        salary.setHourlyRates(50);
        salary.setNumbersOfHoursWorked(40);
        assertEquals(2000, salary.calculateTotalEarningsAfterFortyHours());

    }


    @Test
    void twoEmployeesCanBePaidAfterFortyHours(){
        salary.employeeName("Blackie", "GoodMan");
        assertEquals("Blackie GoodMan", salary.getEmployeeName() );

        salary.setHourlyRates(50);
        salary.setNumbersOfHoursWorked(40);
        assertEquals(2000, salary.calculateTotalEarningsAfterFortyHours());



        salary.employeeName("Dami", "lawal");
        assertEquals("Dami lawal", salary.getEmployeeName() );

        salary.setHourlyRates(100);
        salary.setNumbersOfHoursWorked(40);
        salary.setSalary(4000);
        assertEquals(4000, salary.calculateTotalEarningsAfterFortyHours());
    }


}
