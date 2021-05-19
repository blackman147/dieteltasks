package ChapterSevenTest;

import ChapterSeven.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    Bank bank;

    @BeforeEach
    void startWithThis(){
        bank = new Bank();
    }
    @Test
    void bank_canCreateAccount(){
        Bank bank = new Bank();
        assertNotNull(bank);
    }

    @Test
    void bank_canCreateAccountName(){
        bank.createNewAccount("blackie","Goodman");
        assertEquals("blackie Goodman", bank.getAccountName(1));
    }

    @Test
    void bank_canChangeAccountName(){
        bank.setFirstName();

    }
}
