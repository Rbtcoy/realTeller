package realteller;

public class Account {
   private String accountNumber;
   private String accountType;
   private double accountBalance;


    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountType() {
        return accountType;
    }


    public double getAccountBalance() {
        return accountBalance;
    }


    public Account(String accountNumber, String accountType, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public Account(){
        accountNumber = "";
        accountType = "";
        accountBalance = 0.00;
    }

    public void depositToAccount(double deposit){
        accountBalance += deposit;
    }

    public void withdrawFromAccount(double withdraw){
        if(withdraw <= accountBalance){
        accountBalance -= withdraw;
        }
    }

    public String checkAccountBalance(){
        String result = "";
        result += accountBalance;
        return result;
    }
}
