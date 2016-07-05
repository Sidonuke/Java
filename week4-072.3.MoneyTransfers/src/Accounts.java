
public class Accounts {

    public static void main(String[] args) {
        Account aAccount = new Account("A Account", 100.0);
        Account bAccount = new Account("B Account", 0.0);
        Account cAccount = new Account("C Account", 0.0);
        
        transfer(aAccount,bAccount,50.0);
        transfer(bAccount,cAccount,25.0);
    }
    public static void transfer(Account accountFrom, Account accountTo, double howMuch){
        accountFrom.withdrawal(howMuch);
        accountTo.deposit(howMuch);
        
    }

}
