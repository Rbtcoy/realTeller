package realteller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
    private Bank bank;
        
    @BeforeEach void setUp(){
        bank = new Bank();
    }

    @Test void testMap(){
        assertNotNull(bank.getAccounts(),"Aint no bank here");
    }

    @Test void testGetAllAccounts(){
        Collection<Account> testAccounts;
        testAccounts = bank.getAllAccounts();
        assertEquals(bank.getAccounts().size(), testAccounts.size(), "Accounts don't add up");
    }

    @Test void testOpenNewAccount(){
        int originalSize = bank.getAccounts().size();
        Account account = new Account();
        bank.openNewAccount("test", account);
        assertEquals((originalSize+1),bank.getAccounts().size(),"Didn't add properly");
    }

    @Test void testGetAccount(){
        Account account = new Account();
        bank.openNewAccount("42", account );
        assertEquals(account,bank.getAccount("42"),"didn't get the proper account");
    }
    
    @Test void testCloseAccount(){
        Account account = new Account("234","checkings",3434);
        bank.openNewAccount(account.getAccountNumber(),account);
        assertEquals(account, bank.getAccount("234"), "did't get proper accound");
        bank.closeAccount("234");
        assertNull(bank.getAccount("234"));
    }
}
