import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMTest {

        ATM atm = new ATM();

    @Test
    @DisplayName("Depositing in to ATMTest")
    void depositingIntoAtm(){
        atm.deposit(50000);
        assertEquals(60000, atm.getBalance());
    }

    @Test
    @DisplayName("ATM can check Balance")
    void atmCanCheckBalance(){
        atm.getBalance();
        assertEquals(10000.0, atm.getBalance());
    }
}


