package realteller;

import java.util.Collection;
import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts = new HashMap<String,Account>();

    public HashMap<String,Account> getAccounts(){
        return accounts;
    }

    public Collection<Account> getAllAccounts(){
        Collection<Account> result;
        result = accounts.values();
        return result;
    }

    public void openNewAccount(String key, Account account){
        accounts.put(key, account);
    }

    public Account getAccount(String key){
        return(accounts.get(key));
    }

    public void closeAccount(String accountNumber){
        accounts.remove(accountNumber);
    }
}
