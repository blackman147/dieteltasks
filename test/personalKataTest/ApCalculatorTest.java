package personalKataTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApCalculatorTest {


    @Test
    void testToCalculateArithmeticProgression() {
        ApCalculator ap = new ApCalculator ( );
        assertEquals (8, ap.calculateAp (2, 4, 6));
    }

}
