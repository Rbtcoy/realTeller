package realteller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private Account account;
    
    @BeforeEach void setUp(){
    account = new Account("8675309","checking", 5.00);
    }

    @Test void createAccount(){
        assertNotNull(account, "unable to create account");
    }

    @Test void testGetAccountNumber(){
        assertNotNull(account.getAccountNumber());
    }

    @Test void testGetAccountType(){
        assertNotNull(account.getAccountType());
    }

    @Test void testGetAccountBalance(){
        assertNotNull(account.getAccountBalance());
    }

    @Test void testDeposit(){
        //might be prudent to have a dif temp var to test that the math works, not just the return from method
        account.depositToAccount(2.00);
        assertEquals(7.00, account.getAccountBalance(),"Could not add funds");
    }

    @Test void testWithdraw(){
        account.withdrawFromAccount(2.00);
        assertEquals(3.00, account.getAccountBalance(),"Could not add funds");
    }

    @Test void testBigWithdraw(){
        account.withdrawFromAccount(10.00);
        assertEquals(5.00,account.getAccountBalance(),"aint enough yo!");
    }

    @Test void testConstructor(){
        Account mark = new Account("butt", "under the bed", 10000);
        assertEquals(10000 , mark.getAccountBalance() ,"constructor fail");
        assertEquals("under the bed", mark.getAccountType() ,"constructor fail");
        assertEquals("butt" , mark.getAccountNumber() ,"constructor fail");
    }

    @Test void testShowBalance(){
        String result;
        result = account.checkAccountBalance();
        assertNotNull(result,"could not return account Balance");
    }
}